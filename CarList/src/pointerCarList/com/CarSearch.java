package pointerCarList.com;

import java.util.List;
import java.util.Scanner;

public class CarSearch {
    Scanner scanner = new Scanner(System.in);
    String inp;

    public void knowByEarReleas(List<Car> list) {
        System.out.println("Введите год выпуска");
        inp = scanner.nextLine();
        for (Car car : list) {
            if (inp.equals(car.getYears())) {
                System.out.println("Марка авто " + car.getNames() + " рік " + car.getYears());
            }
        }
    }

    public void searchForaCarbyWheelRadius(List<Car> list) {
        System.out.println("Введите радиус колеса");
        inp = scanner.nextLine();
        int i = Integer.parseInt(inp);
        for (Car car : list) {
            if (i ==(car.getRadius())) {
                System.out.println("Марка авто " + car.getNames() + ", радіус коліс " + car.getRadius());
            }
        }
    }

    public void knowTheColorCar(List<Car> list) {
        System.out.println("Введите цвет авто ");
        inp = scanner.nextLine();
        for (Car car : list) {
            if (inp.toLowerCase().equals(car.getColor())) {
                System.out.println("Марка авто " + car.getNames() + ", колір автомобіля " + car.getColor());
            }
        }
    }

    public void knowByBodyType(List<Car> list) {
        System.out.println("Введите тип кузова ");
        inp = scanner.nextLine();
        for (Car car : list) {
            if (inp.equals(car.getBody())) {
                System.out.println("Марка авто " + car.getNames() + ", кузов " + car.getBody());
            }
        }
    }
}

