import java.util.Scanner;
import java.util.List;

public class CarManager {

    private List<Car> carList;

    public CarManager(List<Car> carList) {
        this.carList = carList;
    }

    Car getCar(String brand) {

        if (CarBrands.valueOf(brand).equals(CarBrands.AUDI)) {
            return new Car(new Body("BLACK", CarBrands.AUDI.getTitle(), new Tank(CarBrands.AUDI.getTankMaxVolume(), 30)), new SteeringWheel(), new Engine(CarBrands.AUDI.getEngiveVolume(), CarBrands.AUDI.getEnginePower()), new Chassis(2.0f));
        } else if (CarBrands.valueOf(brand).equals(CarBrands.BMW)) {
            return new Car(new Body("BLACK", CarBrands.BMW.getTitle(), new Tank(CarBrands.BMW.getTankMaxVolume(), 30)), new SteeringWheel(), new Engine(CarBrands.BMW.getEngiveVolume(), CarBrands.BMW.getEnginePower()), new Chassis(2.0f));
        } else if (CarBrands.valueOf(brand).equals(CarBrands.DODGE)) {
            return new Car(new Body("WHITE", CarBrands.DODGE.getTitle(), new Tank(CarBrands.DODGE.getTankMaxVolume(), 30)), new SteeringWheel(), new Engine(CarBrands.DODGE.getEngiveVolume(), CarBrands.DODGE.getEnginePower()), new Chassis(2.0f));
        } else if (CarBrands.valueOf(brand).equals(CarBrands.HONDA)) {
            return new Car(new Body("RED", CarBrands.HONDA.getTitle(), new Tank(CarBrands.HONDA.getTankMaxVolume(), 30)), new SteeringWheel(), new Engine(CarBrands.HONDA.getEngiveVolume(), CarBrands.HONDA.getEnginePower()), new Chassis(2.0f));
        } else if (CarBrands.valueOf(brand).equals(CarBrands.TOYOTA)) {
            return new Car(new Body("RED", CarBrands.TOYOTA.getTitle(), new Tank(CarBrands.TOYOTA.getTankMaxVolume(), 30)), new SteeringWheel(), new Engine(CarBrands.TOYOTA.getEngiveVolume(), CarBrands.TOYOTA.getEnginePower()), new Chassis(2.0f));
        } else
            return null;
    }

    Scanner in = new Scanner(System.in);

    void addCar() {
        System.out.println("Choose a brand:");
        CarBrands.showAll();
        String brand = in.nextLine().toUpperCase();
        try {
            carList.add(getCar(brand));
        } catch (IllegalArgumentException e) {
            System.out.println("No such brand");
        }
    }

     void findDiameter(float d) {
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getChassis().getWheelPressure() == d) {
                System.out.println(carList.get(i).getBody().getBrand());
            }
        }
    }

     void findDiameterAndColor(float d, String color) {
        for (int i = 0; i < carList.size(); i++) {
            if ((carList.get(i).getChassis().getWheelPressure() == d) && carList.get(i).getBody().getColor() == color) {
                System.out.println(carList.get(i).getBody().getBrand());
            }
        }
    }

     void changeRedCarSteeringWheel() {
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getBody().getColor() == "RED") {
                carList.get(i).getSteeringWheel().changeSteeringWheel("MK_2");
            }
        }
        System.out.println("Steering Wheels in RED cars were changed for -> MK_2");
    }

     void doubleDiameterInCarWithNonDefaultSteeringWheel() {
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getSteeringWheel().getType() != SteeringWheel.DEFAULT_TYPE) {
                System.out.println("Double pressure");
                carList.get(i).pumpAllWheelsTo(carList.get(i).getChassis().getWheelPressure() * 2);
            }
        }
    }

     void replaceCarWithDifferentPressure(float pressure) {
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getChassis().getWheelPressure() != pressure) {
                System.out.println(carList.get(i).getBody().getBrand() + " has different tire pressure. Replacing...");
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

