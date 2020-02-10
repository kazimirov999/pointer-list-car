package pointerCarList.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Body body = new Body();
        Wheel wheel = new Wheel();
        Helm helm = new Helm();
        CarSearch carSearch = new CarSearch();
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Volvo", "1988", 16, "red", "sedan", true));
        cars.add(new Car("Opel", "1998", 16, "blue", "universal", false));
        cars.add(new Car("Audi", "2000", 19, "green", "heshbek", true));
        cars.add(new Car("Subaru", "2000", 24, "red", "sedan", true));
        cars.add(new Car("Jeep", "1998", 20, "blue", "heshbek", false));
        cars.add(new Car("Lada", "1988", 13, "green", "sedan", false));
        cars.add(new Car("Tavriya", "1960", "red", "heshbec"));


        helm.substituteCarsOnShnsh(cars);
        System.out.println("-------------------------------");
        helm.increaseWheelDiametr(cars);
        System.out.println("-------------------------------");
        wheel.replaseStiringWeel(cars);
        System.out.println("-------------------------------");


        body.avtoColorChange(cars);
        System.out.println("-------------------------------");
        carSearch.searchForaCarbyWheelRadius(cars);
        System.out.println("-------------------------------");
        carSearch.knowByBodyType(cars);
        System.out.println("-------------------------------");
        carSearch.knowByEarReleas(cars);
        System.out.println("-------------------------------");
        carSearch.knowTheColorCar(cars);

    }
}


