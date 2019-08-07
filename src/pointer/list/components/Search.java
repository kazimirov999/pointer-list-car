package pointer.list.components;

import pointer.list.Car;
import pointer.list.Color;

import java.util.List;

public interface Search {
    List<Car> getAll();
    List<Car> doSearch(Color bodyColor);
    List<Car> doSearch(float diameter);
    List<Car> doSearch(float diameter, Color bodyColor);
    List<Car> doSearch(boolean steeringWheelHasButtons);
}
