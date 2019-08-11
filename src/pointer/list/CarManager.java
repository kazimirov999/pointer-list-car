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
    private final Search carSearch;

    public CarManager(InputStream source) {
        this.scanner = new Scanner(source);
        this.carSearch = new ConcreteSearch(initCarList());
    }

    public List<Car> getAllCars() {
        return carSearch.getAll();
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
                if (params.length == 1) {
                    System.out.println(Color.hasValue(params[0]) ?
                            carSearch.doSearch(Color.toEnum(params[0])) :
                            carSearch.doSearch(Float.parseFloat(params[0])));
                } else if (params.length == 2) {
                    if (Color.hasValue(params[1])) {
                       System.out.println(carSearch.doSearch(Float.parseFloat(params[0]),
                               Color.toEnum(params[1])));
                    } else {
                        System.out.println("Color '" + params[1] + "' isn't allowed. Allowed colors: "
                                + Arrays.toString(Color.values()));
                    }
                } else {
                    System.out.println("Wrong parameters count.");
                }
            } catch (NumberFormatException nex) {
                System.out.println("Wheel diameter should be float");
            }

            input = scanner.nextLine();
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

        List<Car> cars = carSearch.doSearch(Color.toEnum(next));

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
        List<Car> cars = carSearch.getAll();

        for (Car c : cars) {
            if (c.getWheelsDiameter() >= diameter){
                continue;
            }

            System.out.println(c + " has diameter smaller than " + diameter + ". Set new one:");

            Car car = null;

            while (car == null) {
                car = buildNewCar(scanner.next());
            }

            cars.set(cars.indexOf(c), car);
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

        List<Car> cars = carSearch.doSearch(steeringWheelHasButtons);

        for (Car car : cars) {
            car.changeWheelsDiameter(2);
            System.out.println("Double diameter is made for " + car);
        }
    }

    public void exitIfEmpty() {
        if (carSearch.getAll().size() > 0){
            return;
        }

        scanner.close();
        System.exit(0);
    }

    public void close(){
        scanner.close();
    }

    private List<Car> initCarList() {
        List<Car> carList = carSearch.getEmptyList();
        System.out.println("Type car brand, " + Arrays.toString(Color.values())+ " color and wheel diameter. Type 'done' for finish.");

        String brand = scanner.next();

        while (!brand.equals(DONE)){
            Car car = buildNewCar(brand);

            if (car != null){
                carList.add(car);
            }

            scanner.nextLine();
            brand = scanner.next();
        }

        return carList;
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