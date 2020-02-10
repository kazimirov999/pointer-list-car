package pointerCarList.com;

import java.util.List;

public class Body extends CarSearch {
    private String color;
    private String bodyType;


    public void getColor() {
        this.color = color;
    }

    public void setBodyType(String txt) {
        this.bodyType = bodyType;
    }

    public void avtoColorChange(List<Car> list) {
        System.out.println("Введите цвет авто");
        inp = scanner.nextLine();
        for (Car car1 : list) {
            if (inp.equals(car1.getColor())) {
                String green = car1.setColor("yellow");
                System.out.println("Цвет вашего автомобиля теперь не " + car1.getColor() + " а " + green);
                break;
            } else if (inp != car1.getColor()) {
                System.out.println("автомобилей с таким цветом нет");
                break;
            }
        }
    }
}

