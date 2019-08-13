import java.util.List;
import java.util.Scanner;

public class Car {

    static Scanner scan = new Scanner(System.in);
    private String name;
    SteeringWheel steeringWheel;
    Wheel wheels;
    Body body;
    Engine engine;

    Car(String name, float fuelVolume, float power, String color, float position, float pressure, String steeringWheelType, int diameter) {
        this.name = name;
        this.engine = new Engine(fuelVolume, power);
        this.body = new Body(color);
        this.steeringWheel = new SteeringWheel(position, steeringWheelType);
        this.wheels = new Wheel(pressure, diameter);
    }

    Car(String name, float fuelVolume, float power, String color, float position, String steeringWheelType, int diameter) {
        this.name = name;
        this.engine = new Engine(fuelVolume, power);
        this.body = new Body(color);
        this.steeringWheel = new SteeringWheel(position, steeringWheelType);
        this.wheels = new Wheel(diameter);
    }

    Car() {
        name = "Unknown";
        this.engine = new Engine(0, 100);
        this.body = new Body("Black");
        this.steeringWheel = new SteeringWheel(90);
        this.wheels = new Wheel(15);
    }

    void start() {
        engine.engage();
    }

    public String getName() {
        return name;
    }

    public static void searchByDiameter(List<Car> list) {
        System.out.println("Input diameter");
        int inputDiameter = scan.nextInt();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).wheels.getDiameter() == inputDiameter) {
                System.out.println(list.get(i).getName());
            }
        }
    }

    public static void searchByDiameterAndColor(List<Car> list) {
        System.out.println("Input diameter:");
        int inputDiameter = scan.nextInt();
        System.out.println("Input color:");
        Colors inputColor = Colors.valueOf(scan.next().toUpperCase());

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).wheels.getDiameter() == inputDiameter && list.get(i).body.getColor() == inputColor) {
                System.out.println(list.get(i).getName());
            }
        }
    }

    public static void replaceSteeringWheelsOfRedCars(List<Car> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).body.getColor() == Colors.RED) {
                String preferedSteeringWheelType = scan.next();
                list.get(i).steeringWheel.setSteeringWheelType(preferedSteeringWheelType);
            }
        }
    }

    public static void multiplyDiameterByTwoWhenSteeringWheelIsMuiltifunctioned(List<Car> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).steeringWheel.getSteeringWheelType() == "Multifunctioned") {
                list.get(i).wheels.setDiameter(list.get(i).wheels.getDiameter() * 2);
            }
        }
    }

    public static void replaceCarsWhenDiameterIsLessThanEntered(List<Car> list) {
        System.out.println("Input diameter:");
        int inputDiameter = scan.nextInt();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).wheels.getDiameter() < inputDiameter) {
                list.add(i, new Car());
            }
        }
    }
}