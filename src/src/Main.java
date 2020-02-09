import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();
        CarsManager carsManager = new CarsManager(cars);

        Car volvo = new Car("Volvo", 18, 20, 15,"Green");
        Car landRover = new Car("LandRover", 19, 30,16,"White");
        Car ford = new Car("Ford", 17, 25, 17,"Black");
        Car tesla = new Car("Tesla", 15, 40, 18,"Grey");
        Car mazda = new Car("Mazda", 16, 30, 19,"Purple");

        cars.add(volvo);
        cars.add(landRover);
        cars.add(ford);
        cars.add(tesla);
        cars.add(mazda);

        carsManager.diameterList();
        carsManager.findDiameter();
        carsManager.findDiameterAndColor();
        carsManager.changeRadiusSteeringWheelOnGreenCar();
        carsManager.changeDiameterWheels();
        carsManager.changeCars();


    }
}
