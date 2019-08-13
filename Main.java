public class Main {

    public static void main(String[] args) {


        CarManager.carList.add(CarManager.getCar("BMW"));
        CarManager.carList.add(CarManager.getCar("DODGE"));
        CarManager.carList.add(CarManager.getCar("BMW"));
        CarManager.carList.add(CarManager.getCar("HONDA"));
        CarManager.carList.add(CarManager.getCar("AUDI"));
        CarManager.carList.get(4).getBody().repaint("RED");
        CarManager.carList.add(CarManager.getCar("TOYOTA"));
        CarManager.carList.add(CarManager.getCar("AUDI"));
        CarManager.carList.add(CarManager.getCar("DODGE"));
        CarManager.carList.add(CarManager.getCar("HONDA"));
        CarManager.addCar();
        CarManager.carList.get(9).getBody().repaint("RED");

        CarManager.findDiameter(2.0f);
        CarManager.findDiameterAndColor(2.0f, "BLUE");
        CarManager.changeRedCarSteeringWheel();
        CarManager.doubleDiameterInCarWithNonDefaultSteeringWheel();
        CarManager.replaceCarWithDifferentPressure(2.0f);

    }
}
