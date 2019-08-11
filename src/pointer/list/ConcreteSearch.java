package pointer.list;
import pointer.list.components.Search;

import java.util.LinkedList;
import java.util.List;

public class ConcreteSearch implements Search {
    private final List<Car> carList;

    public ConcreteSearch(List<Car> carList) {
        this.carList = carList;
    }

    public List<Car> getAll() {
        return carList;
    }

    public List<Car> doSearch(float diameter) {
        List<Car> cars = getEmptyList();

        for (Car c : carList) {
            if (c.getWheelsDiameter() == diameter) {
                cars.add(c);
            }
        }

        return cars;
    }

    public List<Car> doSearch(float diameter, Color bodyColor) {
        List<Car> cars = doSearch(diameter);

        for (Car c : cars) {
            if (c.getColor() != bodyColor){
                cars.remove(c);
            }
        }

        return cars;
    }


    public List<Car> doSearch(Color color) {
        List<Car> cars = getEmptyList();

        for (Car c : carList) {
            if (c.getColor() == color) {
                cars.add(c);
            }
        }

        return cars;
    }

    public List<Car> doSearch(boolean steeringWheelHasButtons) {
        List<Car> cars = getEmptyList();

        for (Car c : carList) {
            if (c.getSteeringWheel().hasButtons() == steeringWheelHasButtons) {
                cars.add(c);
            }
        }

        return cars;
    }

    public List<Car> getEmptyList(){
        return new LinkedList<>();
    }
}