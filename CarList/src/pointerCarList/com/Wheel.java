package pointerCarList.com;

import java.util.List;

public class Wheel extends CarSearch {

    private int steerengWhealDiameter = 30;




    public void replaseStiringWeel(List<Car> list){
        System.out.println("ввод");
        inp = scanner.nextLine();
        for (Car car1: list){
            if (inp.equals(car1.getColor()) & car1.getColor() == "red"){
                int s = steerengWhealDiameter + steerengWhealDiameter;
                System.out.println("діамерет руля червоних машин" + s + "мм");
            }
        }
    }

    public void increaseWheelDiametr(List<Car> list){
        System.out.println("машини в яких є мультируль");
        for (Car car: list){
        if (car.getsWm() == true) {
            System.out.println(car.getNames() + " - є");
        }
        }
    }
}

