import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        CarSearch carSearch = new CarSearch();
        carList.add(new Car("Ferrari", "Testarossa", Color.WHITE, 20, 10, false));
        carList.add(new Car("Mazda", "RX-8", Color.RED, 14, 15, true));
        carList.add(new Car("Ford", "GT-40", Color.ORANGE, 18, 14, false));
        carList.add(new Car("Audi", "Quatro", Color.RED, 20, 12, true));
        carList.add(new Car("Toyota", "Celica", Color.ORANGE, 16, 11, false));
        carList.add(new Car("Opel", "Manta", Color.GREEN, 17, 14, false));
        carList.add(new Car("Nissan", "Patrol", Color.BLACK, 19, 15, true));
        carList.add(new Car("Toyota", "Hillux", Color.WHITE, 22, 16, true));

        System.out.println("Searching by color and Radius:");
        carSearch.findCarsWithBodyAndRadius(carList);

        System.out.println("\nSearching by Radius:");
        carSearch.findCarsWheelRadius(carList);

        System.out.println("\nSearching by Radius:");
        carSearch.exchangeCarIfWheelsSmaller(carList);

        System.out.println("\nExchanging Steeringwheel on  red cars:");
        carSearch.exchangeSteeringWheelOnRedCars(carList);

        System.out.println("\nExchanging  wheels  on cars:");
        carSearch.exchangeCarIfWheelsSmaller(carList);


    }
}