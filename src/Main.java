import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Mazda", 50, 100, "Black", 85, 2.34f, "Multifunctioned", 16));
        carList.add(new Car("Chevrolet", 20, 250, "Yellow", 90, "Multifunctioned", 13));
        carList.add(new Car("Ford", 80, 150, "White", 75, "Common", 14));
        carList.add(new Car("Audi", 40, 120, "Violet", 95, "Common", 16));
        carList.add(new Car());
        Car.searchByDiameter(carList);
        Car.searchByDiameterAndColor(carList);
        Car.replaceSteeringWheelsOfRedCars(carList);
        Car.multiplyDiameterByTwoWhenSteeringWheelIsMuiltifunctioned(carList);
        Car.replaceCarsWhenDiameterIsLessThanEntered(carList);
    }
}