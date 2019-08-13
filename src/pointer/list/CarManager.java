package pointer.list;

import pointer.list.components.Search;
import pointer.list.components.SteeringWheel;
import pointer.list.components.Wheel;

import java.io.InputStream;
import java.util.*;

public class CarManager {

    private static final String DONE = "done";
    private static final String WITH = "with";
    private static final String WITHOUT = "without";
    private static final String EMPTY_STRING = "";

    private final Scanner scanner;
    private List<Car> carList = new LinkedList<>();

    public CarManager(InputStream source) {
        this.scanner = new Scanner(source);
        initCarList(carList);
    }

    public List<Car> getAllCars() {
        return carList;
    }

    public void doSearch() {
        System.out.println("Search by color OR diameter OR diameter and color:");
        String input = scanner.nextLine();

        while (!input.equals(DONE)) {
            if (input.equals(EMPTY_STRING)) {
                input = scanner.nextLine();
                continue;
            }

            String[] params = input.split(" ");
            try {
                switch (params.length) {
                    case 1:
                        searchByOneParameter(params);
                        break;
                    case 2:
                        searchByTwoParameters(params);
                        break;
                    default:
                        System.out.println("Wrong parameters count.");
                        break;
                }
            } catch (NumberFormatException nex) {
                System.out.println("Wheel diameter should be float");
            }

            input = scanner.nextLine();
        }
    }

    private void searchByOneParameter(String[] params) {
        if (params.length != 1) {
            System.out.println("Wrong parameters count.");
            return;
        }

        if (Color.hasValue(params[0])) {
            System.out.println(doSearch(car -> car.getColor() == Color.toEnum(params[0])));
        } else {
            System.out.println(doSearch(car -> car.getWheelsDiameter() == Float.parseFloat(params[0])));
        }
    }

    private void searchByTwoParameters(String[] params) {
        if (params.length != 2) {
            System.out.println("Wrong parameters count.");
            return;
        }

        if (Color.hasValue(params[1])) {
            System.out.println(doSearch(car ->
                    (car.getWheelsDiameter() == Float.parseFloat(params[0]) && car.getColor() == Color.toEnum(params[1]))));
        } else {
            System.out.println("Color '" + params[1] + "' isn't allowed. Allowed colors: "
                    + Arrays.toString(Color.values()));
        }
    }

    public void changeSteeringWheel() {
        System.out.println("Change steering wheel to wheel with buttons for all car with some color. Set color:");

        String next = scanner.next();

        if (next.equals(DONE)){
            return;
        }

        if ( !Color.hasValue(next) ) {
            System.out.println("Color '" + next + "' isn't allowed. Allowed colors: "
                    + Arrays.toString(Color.values()));
            return;
        }

        List<Car> cars = doSearch(car -> car.getColor() == Color.toEnum(next));

        for (Car c : cars) {
            c.setSteeringWheel(new SteeringWheel(true));
            System.out.println("Steering Wheel is changed for car: " + c);
        }
    }

    public void changeCarsWithSmallDiameter() {
        System.out.println("Set minimal wheel diameter:");

        String next = scanner.next();
        if (next.equals(DONE)) {
            return;
        }

        float diameter = Float.parseFloat(next);

        List<Car> cars = doSearch(car -> car.getWheelsDiameter() >= diameter);

        for (Car c : cars) {
            System.out.println(c + " has diameter smaller than " + diameter + ". Set new one:");
            Car car = null;

            while (car == null) {
                car = buildNewCar(scanner.next());
            }

            carList.set(carList.indexOf(c), car);
        }
    }

    public void makeDoubleWheelsDiameter() {
        System.out.println("Make double diameter for cars 'with'/'without' buttons");

        String input = scanner.next();

        Boolean steeringWheelHasButtons = input.equals(WITH) ? Boolean.TRUE :
                input.equals(WITHOUT) ? Boolean.FALSE : null;

        if (steeringWheelHasButtons == null) {
            return;
        }

        List<Car> cars = doSearch(car -> car.getSteeringWheel().hasButtons() == steeringWheelHasButtons);

        for (Car car : cars) {
            car.changeWheelsDiameter(2);
            System.out.println("Double diameter is made for " + car);
        }
    }

    public void exitIfEmpty() {
        if (carList.size() > 0){
            return;
        }

        scanner.close();
        System.exit(0);
    }

    public void close(){
        scanner.close();
    }

    private void initCarList(List<Car> list) {
        System.out.println("Type car brand, " + Arrays.toString(Color.values())
                + " color and wheel diameter. Type 'done' for finish.");

        String brand = scanner.next();

        while (!brand.equals(DONE)){
            Car car = buildNewCar(brand);

            if (car != null){
                list.add(car);
            }

            scanner.nextLine();
            brand = scanner.next();
        }
    }

    private List<Car> doSearch(Search search) {
        List<Car> cars = new LinkedList<>();

        for (Car c : carList) {
            if (search.doSearch(c)) {
                cars.add(c);
            }
        }

        return cars;
    }

    private Car buildNewCar(String brand) {
        String color = scanner.next();
        float d;

        if (!Color.hasValue(color)) {
            System.out.println("Color '" + color + "' isn't allowed. Allowed colors: "
                    + Arrays.toString(Color.values()));
            return null;
        }

        try {
             d = Float.parseFloat(scanner.next());
        } catch (NumberFormatException nex) {
            System.out.println("Wheel diameter should be float");
            return null;
        }

        return new Car(brand, Color.toEnum(color), new Wheel(d), new Wheel(d), new Wheel(d), new Wheel(d));
    }
}