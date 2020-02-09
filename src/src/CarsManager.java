import java.util.List;

public class CarsManager {

     private List<Car> cars;

    public CarsManager(List<Car> cars) {
        this.cars = cars;
    }

    void diameterList(){
        for (Car car : cars){
            System.out.println(car.wheels.getDiameter());
        }
    }

    void findDiameter(int d){
        for (Car car : cars){
            if (car.wheels.getDiameter() == d){
                System.out.println(car.getModel());
            }
        }
    }

    void findDiameterAndColor (int d, String c){
        for (Car car : cars){
            if ((car.wheels.getDiameter() == d) && (car.body.getColor().equals(c))){
                System.out.println(car.getModel());
            }
        }
    }

    void changeRadiusSteeringWheelonGreenCar(int r){
        for (Car car : cars){
            if (car.body.getColor().equals("Green")){
                car.steeringWheel.setRadius(r += 20);
                System.out.println(car.steeringWheel.getRadius());
            }

        }
    }

    void changeDiameterWheels(int d){
        for (Car car : cars){
            if (car.steeringWheel.getButtons() == d){
                System.out.println(car.wheels.getDiameter() * 2);
            }
        }
    }
    void changeCars(int d) {
        for (int i = 0; i < cars.size(); i++)
            if (cars.get(i).wheels.getDiameter() < d){
                cars.add(i, new Car());
                break;
        }

    }
}
