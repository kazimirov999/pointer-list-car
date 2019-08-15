import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Engine mazdaEngine = new Engine(50, 100);
        Engine chevroletEngine = new Engine(20, 250);
        Engine fordEngine = new Engine(80, 150);
        Engine audiEngine = new Engine(40, 120);
        Body blackBody = new Body("Black");
        Body yellowBody = new Body("Yellow");
        Body whiteBody = new Body("White");
        Body violetBody = new Body("Violet");
        SteeringWheel commonSteeringWheel = new SteeringWheel(true);
        SteeringWheel multifunctionedSteeringWheel = new SteeringWheel( true);
        Wheel mazdaWheels = new Wheel(16);
        Wheel chevroletWheels = new Wheel(13);
        Wheel fordWheels = new Wheel(14);
        Wheel audiWheels = new Wheel(16);
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Mazda", mazdaEngine, blackBody, multifunctionedSteeringWheel, mazdaWheels));
        carList.add(new Car("Chevrolet", chevroletEngine, yellowBody, multifunctionedSteeringWheel, chevroletWheels));
        carList.add(new Car("Ford", fordEngine, whiteBody, commonSteeringWheel, fordWheels));
        carList.add(new Car("Audi", audiEngine, violetBody, commonSteeringWheel, audiWheels));
        carList.add(new Car());
        CarManager.searchByDiameter(carList);
        CarManager.searchByDiameterAndColor(carList);
        CarManager.replaceSteeringWheelsOfRedCars(carList);
        CarManager.multiplyDiameterByTwoWhenSteeringWheelIsMuiltifunctioned(carList);
        CarManager.replaceCarsWhenDiameterIsLessThanEntered(carList);
    }
}