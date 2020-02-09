import java.util.List;
import java.util.Scanner;

public class CarsManager {

     private List<Car> cars;

    public CarsManager(List<Car> cars) {
        this.cars = cars;
    }

    void diameterList(){
        for (Car car : cars){
            System.out.println(car.wheels.getDiameter());
        }
    }

    Scanner scanner = new Scanner(System.in);

    void findDiameter(){
        System.out.println("Введіть діаметр колеса: ");
        int d = scanner.nextInt();
        for (Car car : cars){
            if (car.wheels.getDiameter() == d){
                System.out.println(car.getModel());
            }
        }
    }

    void findDiameterAndColor (){
        System.out.println("Введіть діаметр колеса та колір авто: ");
        int d = scanner.nextInt();
        String c = scanner.nextLine();
        for (Car car : cars){
            if ((car.wheels.getDiameter() == d) && (car.body.getColor().equals(c))){
                System.out.println(car.getModel());
            }
        }
    }

    void changeRadiusSteeringWheelOnGreenCar(){
        System.out.println("Введіть колір авто, якщо зелений, то радіус керма збільшиться на 20: ");
        String c = scanner.nextLine();
        for (Car car : cars){
            if (car.body.getColor().equals("Green")){
                car.steeringWheel.setRadius(20);
                System.out.println(car.steeringWheel.getRadius());
            }

        }
    }

    void changeDiameterWheels(){
        System.out.println("Введіть кількість кнопок (20, 25, 30, 40): ");
        int b = scanner.nextInt();
        for (Car car : cars){
            if (car.steeringWheel.getButtons() == b){
                System.out.println(car.wheels.getDiameter() * 2);
            }
        }
    }
    void changeCars() {
        System.out.println("Введіть діаметр колеса: ");
        int d = scanner.nextInt();
        for (int i = 0; i < cars.size(); i++)
            if (cars.get(i).wheels.getDiameter() < d){
                cars.add(i, new Car());
                break;
        }

    }
}
