import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> listCar = new ArrayList<>();
        listCar.add(new Car("BMW", "525", 32, true, 15, "Red"));
        listCar.add(new Car("Audi", "A6", 28, true, 16, "White"));
        listCar.add(new Car("Daewoo", "Lanos", 18, false, 15, "Red"));
        listCar.add(new Car("Toyota", "Camry", 35, true, 16, "Black"));
        listCar.add(new Car("Lada", "Priora", 35, false, 15, "Blue"));


        CarFinder.searchByWheelRadius(listCar);
        CarFinder.searchByWheelRadiusAndColor(listCar);
        CarFinder.searchRedCarAndChangeSteeringWheelRadius(listCar);
        CarFinder.setWheelRadiusIfSteeringWheeHasButton(listCar);
        CarFinder.replaceCarAtRadius(listCar);

    }

}
