import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarManager {
    static List<Car> carList = new ArrayList<Car>();

    static Car getCar(String brand) {

        if (CarBrands.valueOf(brand).equals(CarBrands.AUDI)) {
            return new Car(new Body("BLACK"), new SteeringWheel(new Chassis(new Wheel[]{new Wheel(2.0f), new Wheel(2.0f)},
                    new Wheel[]{new Wheel(2.0f), new Wheel(2.0f)})), new Engine(CarBrands.AUDI.getEngiveVolume(), 233, 100, 50.0f), brand);
        } else if (CarBrands.valueOf(brand).equals(CarBrands.BMW)) {
            return new Car(new Body("BLACK"), new SteeringWheel(new Chassis(new Wheel[]{new Wheel(2.0f), new Wheel(2.0f)},
                    new Wheel[]{new Wheel(2.0f), new Wheel(2.0f)})), new Engine(CarBrands.BMW.getEngiveVolume(), 184, 100, 100), brand);
        } else if (CarBrands.valueOf(brand).equals(CarBrands.DODGE)) {
            return new Car(new Body("WHITE"), new SteeringWheel(new Chassis(new Wheel[]{new Wheel(2.0f), new Wheel(2.0f)},
                    new Wheel[]{new Wheel(2.0f), new Wheel(2.0f)})), new Engine(CarBrands.DODGE.getEngiveVolume(), 215, 100, 100), brand);
        } else if (CarBrands.valueOf(brand).equals(CarBrands.HONDA)) {
            return new Car(new Body("BLUE"), new SteeringWheel(new Chassis(new Wheel[]{new Wheel(2.0f), new Wheel(2.0f)},
                    new Wheel[]{new Wheel(2.0f), new Wheel(2.0f)})), new Engine(CarBrands.HONDA.getEngiveVolume(), 86, 100, 100), brand);
        } else if (CarBrands.valueOf(brand).equals(CarBrands.TOYOTA)) {
            return new Car(new Body("BLUE"), new SteeringWheel(new Chassis(new Wheel[]{new Wheel(2.0f), new Wheel(2.0f)},
                    new Wheel[]{new Wheel(2.0f), new Wheel(2.0f)})), new Engine(CarBrands.TOYOTA.getEngiveVolume(), 386, 100, 100), brand);
        } else
            return null;
    }

    static Scanner in = new Scanner(System.in);

    static void addCar() {
        System.out.println("Choose a brand:");
        CarBrands.showAll();
        String brand = in.nextLine().toUpperCase();
        try {
            carList.add(getCar(brand));
        } catch (IllegalArgumentException e) {
            System.out.println("No such brand");
        }
    }

    static Car addCustomCarFourWheels(String color, float pressureFront, float pressureBack, float volume, float power, float fuel, String brand) {
        return new Car(new Body(color), new SteeringWheel(new Chassis(new Wheel[]{new Wheel(pressureFront), new Wheel(pressureFront)},
                new Wheel[]{new Wheel(pressureBack), new Wheel(pressureBack)})), new Engine(volume, power, 100, fuel), brand);
    }

    static void findDiameter(float d) {
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getSteeringWheel().chassis.getWheelPressure() == d) {
                System.out.println(carList.get(i).getBrand());
            }
        }
    }

    static void findDiameterAndColor(float d, String color) {
        for (int i = 0; i < carList.size(); i++) {
            if ((carList.get(i).getSteeringWheel().chassis.getWheelPressure() == d) && carList.get(i).getBody().getColor() == color) {
                System.out.println(carList.get(i).getBrand());
            }
        }
    }

    static void changeRedCarSteeringWheel() {
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getBody().getColor() == "RED") {
                carList.get(i).getSteeringWheel().changeSteeringWheel("MK_2");
            }
        }
        System.out.println("Steering Wheels in RED cars were changed for -> MK_2");
    }

    static void doubleDiameterInCarWithNonDefaultSteeringWheel() {
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getSteeringWheel().getType() != SteeringWheel.DEFAULT_TYPE) {
                System.out.println("Double pressure");
                carList.get(i).pumpAllWheelsTo(carList.get(i).getSteeringWheel().chassis.getWheelPressure() * 2);
            }
        }
    }

    static void replaceCarWithDifferentPressure(float pressure) {
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getSteeringWheel().chassis.getWheelPressure() != pressure) {
                System.out.println(carList.get(i).getBrand() + " has different tire pressure. Replacing...");
                carList.remove(i);
                System.out.println("Choose a brand:");
                CarBrands.showAll();
                String brand = in.nextLine().toUpperCase();
                try {
                    carList.add(i, getCar(brand));
                } catch (IllegalArgumentException e) {
                    System.out.println("No such brand, adding HONDA");
                } finally {
                    carList.add(i, getCar("HONDA"));
                }
            }
        }
    }

}