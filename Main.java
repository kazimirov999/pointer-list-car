import java.util.ArrayList;

public class Main {

    public static void main(String[]args){
        ArrayList<Car>cars=new ArrayList<Car>();
        CarManager carManager=new CarManager(cars);

        cars.add(carManager.getCar("BMW"));
        cars.add(carManager.getCar("BMW"));
        cars.add(carManager.getCar("DODGE"));
        cars.add(carManager.getCar("BMW"));
        cars.add(carManager.getCar("HONDA"));
        cars.add(carManager.getCar("AUDI"));
        cars.get(4).getBody().repaint("RED");
        cars.add(carManager.getCar("TOYOTA"));
        cars.add(carManager.getCar("AUDI"));
        cars.add(carManager.getCar("DODGE"));
        cars.add(carManager.getCar("HONDA"));

        carManager.findDiameter(2.0f);
        carManager.findDiameterAndColor(2.0f, "BLUE");
        carManager.changeRedCarSteeringWheel();
        carManager.doubleDiameterInCarWithNonDefaultSteeringWheel();
        carManager.replaceCarWithDifferentPressure(2.0f);
    }
}
