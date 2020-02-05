import java.util.List;
import java.util.Scanner;

public class CarFinder {
    static Scanner scanner = new Scanner(System.in);


    static void searchByWheelRadius(List<Car> list) {
        System.out.println("Для поиска введите диаметер колес:");
        int inputRadius = scanner.nextInt();
        for (Car car : list) {
            if (car.wheel.getWheelRadius() == inputRadius) {
                System.out.print(car.getMark());
                System.out.println(" " + car.getModel());
            }
        }

    }

    static void searchByWheelRadiusAndColor(List<Car> list) {
        System.out.println("Для поиска введите диаметер колес:");
        int inputRadius = scanner.nextInt();
        System.out.println("Для поиска введите цвет авто:");
        String inputColor = scanner.nextLine();
        for (Car car : list) {
            if (car.wheel.getWheelRadius() == inputRadius && car.body.getColor().equals(inputColor)) {
                System.out.print(car.getMark());
                System.out.println(" " + car.getModel());
            }
        }
    }

    static void searchRedCarAndChangeSteeringWheelRadius(List<Car> list) {
        for (Car car : list) {
            if (car.body.getColor().equals("Red")) {
                car.steeringWheel.setSteeringWheelRadius(4);
                System.out.print(car.getMark());
                System.out.println(" " + car.getModel());
                System.out.println(" " + car.steeringWheel.getSteeringWheelRadius());
            }
        }
    }

    static void setWheelRadiusIfSteeringWheeHasButton(List<Car> list) {
        for (Car car : list) {
            if (car.steeringWheel.isSteeringWheelButton()) {
                car.wheel.setWheelRadius(car.wheel.getWheelRadius() * 2);
                System.out.print(car.getMark());
                System.out.println(" " + car.getModel());
                System.out.println(" " + car.wheel.getWheelRadius());
            }
        }
    }

    static void replaceCarAtRadius(List<Car> list) {
        System.out.println("Для замены авто, введите диаметер колес:");
        int inputRadius = scanner.nextInt();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).wheel.getWheelRadius() < inputRadius) {
                list.add(i, new Car());
                System.out.print(list.get(i).getMark());
                System.out.println(" " + list.get(i).getModel());
                System.out.println(" " + list.get(i).steeringWheel.isSteeringWheelButton());
                System.out.println(" " + list.get(i).steeringWheel.getSteeringWheelRadius());
                System.out.println(" " + list.get(i).body.getColor());
            }
        }
    }
}
