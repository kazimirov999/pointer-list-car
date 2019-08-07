package pointer.list;

import pointer.list.components.Search;
import pointer.list.components.SteeringWheel;
import pointer.list.components.Wheel;

import java.io.InputStream;
import java.util.*;

public class CarManager {

    private final static String DONE = "done";
    private final static String WITH = "with";
    private final static String WITHOUT = "without";
    private static final String EMPTY_STRING = "";

    private final Scanner scanner;
    private Search carSearch;

    public CarManager(InputStream source) {
        this.scanner = new Scanner(source);
        this.carSearch = new ConcreteSearch(getCarList());
    }

    public List<Car> getCarList() {
        List<Car> carList = ConcreteSearch.getEmptyList();
        System.out.println("Type car brand, " + Arrays.toString(Color.values())+ " color and wheel diameter. Type 'done' for finish.");

        String brand = scanner.next();

        while (!brand.equals(DONE)){
            carList.add(getCar(brand));

            scanner.nextLine();
            brand = scanner.next();
        }

        return carList;
    }

    public void changeCarsWithSmallDiameter() {
        System.out.println("Set minimal wheel diameter:");

        String next = scanner.next();
        if (next.equals(DONE)) {
            return;
        }

        Float diameter = Float.parseFloat(next);
        List<Car> cars = carSearch.getAll();

        for (Car c : cars) {
            if (c.getWheels()[0].getDiameter() >= diameter){
                continue;
            }

            System.out.println(c + " has diameter smaller than " + diameter + ". Set new one:");
            cars.set(cars.indexOf(c), getCar(scanner.next()) );
        }
    }

    private Car getCar(String brand) {
        String color = scanner.next();

        try {
            float d = Float.parseFloat(scanner.next());
            return new Car(brand, Color.toEnum(color),
                    new Wheel(d), new Wheel(d), new Wheel(d), new Wheel(d));
        } catch (NumberFormatException | InputMismatchException nex) {
            System.out.println("Wheel diameter should be float");
        } catch (IllegalArgumentException iex) {
            System.out.println("Color '" + color + "' isn't allowed. Allowed colors: "
                    + Arrays.toString(Color.values()));
        }

        return null;
    }

    public List<Car> getAllCars() {
        return carSearch.getAll();
    }

    public void doSearch() {
        System.out.println("ConcreteSearch by color OR diameter OR diameter and color:");
        String input = scanner.nextLine();

        while (!input.equals(DONE)) {
            if (input.equals(EMPTY_STRING)) {
                input = scanner.nextLine();
                continue;
            }

            String[] params = input.split(" ");
            try {
                if (params.length == 1) {
                    try {
                        System.out.println(carSearch.doSearch(Color.toEnum(params[0])));
                    } catch (IllegalArgumentException iex) {
                        System.out.println(carSearch.doSearch(Float.parseFloat(params[0])));
                    }
                } else if (params.length == 2) {
                    System.out.println(carSearch.doSearch(Float.parseFloat(params[0]), Color.toEnum(params[1])));
                } else {
                    System.out.println("Wrong parameters count.");
                }
            } catch (NumberFormatException nex) {
                System.out.println("Wheel diameter should be float");
            } catch (IllegalArgumentException colorEx) {
                System.out.println("Color '" + params[1] + "' isn't allowed. Allowed colors: "
                        + Arrays.toString(Color.values()));
            }

            input = scanner.nextLine();
        }
    }

    public void changeSteeringWheel() {
        System.out.println("Change steering wheel to wheel with buttons for all car with some color. Set color:");

        List<Car> cars = ConcreteSearch.getEmptyList();
        String next = scanner.next();

        if (next.equals(DONE)){
            return;
        }

        try {
            cars = carSearch.doSearch(Color.toEnum(next));
        }  catch (IllegalArgumentException iex) {
            System.out.println("Color '" + next + "' isn't allowed. Allowed colors: "
                    + Arrays.toString(Color.values()));
        }

        for (Car c : cars) {
            c.setSteeringWheel(new SteeringWheel(true));
            System.out.println("Steering Wheel is changed for car: " + c);
        }
    }

    public void makeDoubleWheelsDiameter() {
        System.out.println("Make double diameter for cars 'with'/'without' buttons");

        String input = scanner.next();

        Boolean steeringWheelHasButtons = input.equals(WITH) ? Boolean.TRUE :
                input.equals(WITHOUT) ? Boolean.FALSE : null;

        if (input.equals(DONE) || steeringWheelHasButtons == null) {
            return;
        }

        List<Car> cars = carSearch.doSearch(steeringWheelHasButtons);

        for (Car car : cars) {
            Wheel[] wheels = car.getWheels();

            for (Wheel wheel : wheels) {
                wheel.setDiameter(2 * wheel.getDiameter());
            }

            System.out.println("Double diameter is made for " + car);
        }
    }

    public void exitIfEmpty() {
        if (carSearch.getAll().size() >= 0){
            return;
        }

        scanner.close();
        System.exit(0);
    }

    public void close(){
        scanner.close();
    }
}