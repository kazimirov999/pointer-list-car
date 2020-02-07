import java.util.List;
import java.util.Scanner;

public class CarSearch {
    static Scanner str = new Scanner(System.in);

    public static void findCarsWheelRadius(List<Car> carList) {
        System.out.println("Write R' wheel to find a suitable car- ");
        int inputRadius = str.nextInt();
        for (Car car : carList) {
            if (car.wheel.getWheelRadius() == inputRadius) {
                System.out.println(car.getBrand());
                System.out.println(car.getModel());
            }
        }
    }


    public static void findCarsWithBodyAndRadius(List<Car> carList) {
        System.out.println("Write R' wheel to find a suitable car- ");
        int inputRadius = str.nextInt();
        System.out.println("Write your color to find a suitable car -  ");
        var inputColor = str.nextLine();

        for (Car car : carList) {
            if (car.body.getColor().equals(inputColor) & (car.wheel.getWheelRadius() == inputRadius)) {
                System.out.println(car.getBrand());
                System.out.println(car.getModel());

            }
        }
    }

    public static void exchangeSteeringWheelOnRedCars(List<Car> carList) {
        for (Car car : carList) {
            if (car.body.getColor().equals("Red")) {
                car.steeringWheel.setRadiusSteeringWheel(+5);
            }
            System.out.println(car.getBrand());
            System.out.println(car.getModel());
            System.out.println(car.steeringWheel.getRadiusSteeringWheel());

        }
    }

    public static void enlargeWheelRadiusIfSteeringWheelWithButtons(List<Car> carList) {
        for (Car car : carList) {
            if (car.steeringWheel.areButtonsOnSteeringWheel()) {
                car.wheel.setWheelRadius(car.wheel.getWheelRadius() * 2);
                System.out.println(car.getBrand());
                System.out.println(car.getModel());
                System.out.println(car.wheel.getWheelRadius());
            }

        }

    }

    public static void exchangeCarIfWheelsSmaller(List<Car> carList) {
        for (Car car : carList) {
            System.out.println("Write R' wheel to find a suitable car and exchange it- ");
            int inputRadius = str.nextInt();
            for (int i = 0; i < carList.size(); i++) {
                if (carList.get(i).wheel.getWheelRadius() < inputRadius) {
                    carList.add(i, new Car());
                    System.out.println(carList.get(i).getBrand());
                    System.out.println(carList.get(i).getModel());
                    System.out.println(carList.get(i).body.getColor());
                    System.out.println(carList.get(i).steeringWheel.getRadiusSteeringWheel());
                    System.out.println(carList.get(i).steeringWheel.areButtonsOnSteeringWheel());
                }
            }
        }
    }


}


