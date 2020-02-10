import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CarSearch {

    private Scanner scanInt = new Scanner(System.in);
    private Scanner scanStr = new Scanner(System.in);

    public void findCarsWheelRadius(List<Car> carList) {
        System.out.println("Write R' wheel to find a suitable car- ");
        int inputRadius = scanInt.nextInt();
        for (Car car : carList) {
            if (car.wheel.getWheelRadius() == inputRadius) {
                System.out.println(car.getBrand());
                System.out.println(car.getModel());
            }
        }
    }

    public void findCarsWithBodyAndRadius(List<Car> carList) throws RuntimeException {
        int inputColor = 0;
        int inputRadius = 0;
        try {
            System.out.println("Write R' wheel to find a suitable car- ");
            inputRadius = scanInt.nextInt();
            System.out.println("Write your color to find a suitable car \n (1 - WHITE, 2 - BLUE, 3 - GREEN) ");
            inputColor = scanStr.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Exception");
        }
        Color color;
        switch (inputColor) {
            case 1:
                color = Color.WHITE;
                break;
            case 2:
                color = Color.BLACK;
                break;
            case 3:
                color = Color.GREEN;
                break;
            case 4:
                color = Color.RED;
                break;
            default:
                color = Color.ORANGE;
        }
        for (Car car : carList) {
            if (car.body.getColor().name().equals(color.toString()) & (car.wheel.getWheelRadius() == inputRadius)) {
                System.out.println(car.getBrand());
                System.out.println(car.getModel());
            }
        }
    }

    public void exchangeSteeringWheelOnRedCars(List<Car> carList) {
        for (Car car : carList) {
            if (car.body.getColor().name().equals(Color.RED.toString())) {
                car.steeringWheel.setRadiusSteeringWheel(+5);
            }
            System.out.println(car.getBrand());
            System.out.println(car.getModel());
            System.out.println(car.steeringWheel.getRadiusSteeringWheel());

        }
    }


    public void enlargeWheelRadiusIfSteeringWheelWithButtons(List<Car> carList) {
        for (Car car : carList) {
            if (car.steeringWheel.areButtonsOnSteeringWheel()) {
                car.wheel.setWheelRadius(car.wheel.getWheelRadius() * 2);
                System.out.println(car.getBrand());
                System.out.println(car.getModel());
                System.out.println(car.wheel.getWheelRadius());
            }

        }
    }

    public void exchangeCarIfWheelsSmaller(List<Car> allCars) {
        Car defaultCar = new Car();
        System.out.println("Write R' wheel to find a suitable car and exchange it- ");
        int inputRadius = scanInt.nextInt();
        for (int i = 0; i < allCars.size(); i++) {
            if (allCars.get(i).wheel.getWheelRadius() < inputRadius) {
                System.out.println(String.format("Car with index %d before exchanging %s", i, allCars.get(i).toString()));
//                System.out.println(String.format("Car with index" + i + "before exchanging" + allCars.get(i).toString()));
                allCars.set(i, defaultCar);
                System.out.println(String.format("Car with index %d after exchanging %s", i, allCars.get(i).toString()));
            }
        }
    }
}


