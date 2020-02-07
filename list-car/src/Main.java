import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Car> carList = new ArrayList<>();
        carList.add(new Car("Skoda",260, 1598));
        carList.add(new Car("Volkswagen",280, 1998));
        carList.add(new Car("Mazda",240, 1794 ));
        carList.add(new Car("Honda",280, 2359));
        carList.add(new Car("Audi",300, 2656));

        carList.get(0).wheels.setDiameter(15);
        carList.get(2).wheels.setDiameter(14);
        carList.get(0).body.setColor("червоний");
        carList.get(2).body.setColor("червоний");
        carList.get(4).body.setColor("червоний");

        while (true) {
            String input = reader.readLine().toLowerCase();
            if (input.equals("exit")) {break;}
            else {
                switch (input) {
                    case "showallbase":
                        showAllBase(carList);
                        break;
                    case "addcartobase":
                        System.out.println("Enter the brand of the car, maxSpeed and motorVolume");
                        addCarToBase(carList,reader.readLine(), Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine()));
                        System.out.println("Авто упішно додано");
                        break;
                    case "findbydiameter":
                        System.out.println("Enter the diameter of the wheels");
                        for (Object x: findByDiameter(carList,  reader.readLine())){
                            System.out.println(x);}
                        break;
                    case "findbydiameterandcolor":
                        System.out.println("Enter the diameter of the wheels and body color");
                        for (Object x: findByDiameterAndColor(carList, reader.readLine(), reader.readLine())){
                            System.out.println(x);}
                        break;
                    case "changethesteeringwheel":
                        System.out.println("Enter body color");
                        changeTheSteeringWheel(carList, reader.readLine());
                        System.out.println("Кермо успішно змінено");
                        break;
                    case "сhangewheeldiameter":
                        сhangeWheelDiameter(carList);
                        System.out.println("Диски успішно збільшені");
                        break;
                    case "changecarbydiameter":
                        System.out.println("Enter the diameter of the wheels");
                        changeCarByDiameter(carList, reader.readLine());
                        System.out.println("Авто успішно замінені");
                        break;
                    default:
                        System.out.println("Choose one of the available methods " + "\n" +
                                "- showAllBase             --> Виводить всі авто які є в базі" + "\n" +
                                "- addCarToBase            --> Додає авто до бази автомобілів" + "\n" +
                                "- findByDiameter          --> Шукає машини, які мають введений діаметр коліс" + "\n" +
                                "- findByDiameterAndColor  --> Шукає машини, які мають введений діаметр коліс та колір кузова" + "\n" +
                                "- changeTheSteeringWheel  --> Замінює в усіх машинах, які мають червоний колір кузова, кермо на інше" + "\n" +
                                "- сhangeWheelDiameter     --> Збільшує діаметр коліс вдвічі, якщо кермо має кнопочки" + "\n" +
                                "- changeCarByDiameter     --> Замінює усі машини, які мають колеса діаметром менші за введене значення, на інші машини.\n" +
                                "- exit                    --> Зупиняє роботу з базою");
                        break;
                }
            }
        }
    }

    public static void showAllBase(ArrayList<Car> carList){
        for (Object x: carList){
            System.out.println(x);
        }
    }

    public static void addCarToBase(ArrayList<Car> carList, String brand, int maxSpeed, int motorVolume){
        carList.add(new Car(brand,maxSpeed, motorVolume));
    }

    public static ArrayList findByDiameter(ArrayList<Car> carList, String readDiameter) {
        ArrayList<Car> carByDiameter = new ArrayList<>();
        for (int i = 0; i < carList.size(); i++) {
            if ((carList.get(i).wheels.getDiameter() == Integer.parseInt(readDiameter))) {
                carByDiameter.add(carList.get(i));
            }
        }
        if (carByDiameter.size() == 0) {System.out.println("Таке авто в базі відсутнє");}
        return carByDiameter;
    }

    public static ArrayList findByDiameterAndColor(ArrayList<Car> carList, String diameter, String color) {
        ArrayList<Car> carByDiameterAndColor = new ArrayList<>();
        for (int i = 0; i < carList.size(); i++) {
            if ((carList.get(i).wheels.getDiameter() == Integer.parseInt(diameter)) && (carList.get(i).body.getColor().equals(color))) {
                carByDiameterAndColor.add(carList.get(i));
            }
        }
        if (carByDiameterAndColor.size() == 0) {
            System.out.println("Таке авто в базі відсутнє");
        }
        return carByDiameterAndColor;
    }

    public static ArrayList changeTheSteeringWheel(ArrayList<Car> carList , String color){
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).body.getColor().equals(color)) {
                carList.get(i).setSteeringWheel(5);
            }
        }
        return carList;
    }

    public static ArrayList сhangeWheelDiameter(ArrayList<Car> carList){
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).steeringWheel.getButtons() > 0) {
                carList.get(i).wheels.setDiameter(carList.get(i).wheels.getDiameter()*2);
            }
            else return null;
        }
        return carList;
    }

    public static ArrayList<Car> changeCarByDiameter(ArrayList<Car> carList, String diameter){
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).wheels.getDiameter() < Integer.parseInt(diameter)) {
                carList.set(i ,carList.get(carList.size()-1));
            }
        }
        return carList;
    }
}

