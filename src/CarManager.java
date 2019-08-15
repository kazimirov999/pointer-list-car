import java.util.List;
import java.util.Scanner;

public class CarManager {
    static Scanner scan = new Scanner(System.in);

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
                if (preferedSteeringWheelType == "Multifunctioned") {
                    list.get(i).steeringWheel.setType(true);
                } else if (preferedSteeringWheelType == "Common") {
                    list.get(i).steeringWheel.setType(false);
                    ;
                } else {
                    System.out.println("You have chosen wrong steering wheel type. Failed changing");
                }
            }
        }
    }

    public static void multiplyDiameterByTwoWhenSteeringWheelIsMuiltifunctioned(List<Car> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).steeringWheel.isMuiltifunctioned()) {
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
