package pointerCarList.com;

import java.util.List;

public class Helm extends CarSearch {

    public void increaseWheelDiametr(List<Car> list) {
        System.out.println("машини в яких є мультируль");
        for (Car car : list) {
            if (car.getsWm() == true) {
                System.out.println("введіть діаметер на який має збільшитись радіус коліс");
                inp = scanner.nextLine();
                System.out.println(car.getNames() + " шини було збільшено на - " + inp);

            }
        }
    }

    public void substituteCarsOnShnsh(List<Car> list){
        System.out.println("диаметер");
        inp = scanner.nextLine();
        int inp1 = Integer.parseInt(inp);
        for (Car car: list)
        if (inp1 >= car.getRadius()){
            System.out.println(car.getNames());
        }
    }
}

