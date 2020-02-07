import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Ferrari", "Testarossa", "White", 20, 10, false));
        carList.add(new Car("Mazda", "RX-8", "White", 14, 15, true));
        carList.add(new Car("Ford", "GT-40", "Red", 18, 14, false));
        carList.add(new Car("Audi", "Quatro", "Black", 20, 12, true));
        carList.add(new Car("Toyota", "Celica", "Orange", 16, 11, false));
        carList.add(new Car("Opel", "Manta", "Green", 17, 14, false));
        carList.add(new Car("Nissan", "Patrol", "Silver", 19, 15, true));
        carList.add(new Car("Toyota", "Hillux", "White", 22, 16, true));


        CarSearch.findCarsWithBodyAndRadius(carList);

    }
}
