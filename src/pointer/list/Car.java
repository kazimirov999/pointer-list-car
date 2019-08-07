package pointer.list;

import pointer.list.components.*;

public class Car {
    private String brand;
    private float totalDistance;

    private SteeringWheel steeringWheel = new SteeringWheel(false);
    private final Engine engine;
    private Wheel[] wheels;
    private final Body body;
    private final Tank tank;

    public Car(String brand, Color carColor, Wheel... wheels) {
        this(brand,carColor,60, wheels);
    }

    public Car(String brand, Color carColor, float gasUsage, Wheel... wheels) {
        this(brand,carColor,60, gasUsage, wheels);
    }

    public Car(String brand, Color carColor, int tank, Wheel... wheels) {
        this(brand,carColor,tank, 8.1f, wheels);
    }

    public Car(String brand, Color carColor, int tank, float gasUsage, Wheel... wheels) {
        this(brand,carColor,tank,2.0f, 120, gasUsage, wheels);
    }

    public Car(String brand, Color carColor, int tank, float volume, int power, float gasUsage, Wheel... wheels) {
        this.brand = brand;
        this.body = new Body(carColor);
        this.wheels = wheels;
        this.tank = new Tank(tank);
        this.engine = new Engine(volume, power, gasUsage);
        pumpWheels();
    }

    public Color getCarColor() {
        return body.getColor();
    }

    public void changeWheel(int index, Wheel wheel) {
        System.out.println("Wheel " + index + " is changed to new one.");
        wheels[index] = wheel;
    }

    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(SteeringWheel steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void start() {
        if (!engine.isOn()) {
            engine.ingine();
        }
    }

    public void turn(Direction direction) {
        steeringWheel.turn(direction);
    }

    public void clean() {
        body.clean();
    }

    public void pumpWheels() {
        for (Wheel wheel : wheels) {
            wheel.pump();
        }

        System.out.println("Wheels are pumped.");
    }

    public void drive(int km) {
        if (km <= 0) {
            System.out.println("You have set negative or zero distance.");
            return;
        }

        if (tank.isEmpty()) {
            System.out.println("The gas is run out. Please re-fuel the car.");
            return;
        }

        float distance = tank.getFuel() / engine.getGasUsage() * 100;

        if (km <= distance) {
            totalDistance +=km;
            tank.setFuel(tank.getFuel() - engine.getGasUsage() * km / 100);
            System.out.println("Car is driven during " + km + ". Total distance is: " + totalDistance + " km.");
        } else {
            totalDistance += distance;
            tank.setFuel(0); // all fuel are used.
            System.out.println("You cannot drive full distance. Car is driven during " + distance + ". Total distance is: " + totalDistance + " km.");
        }
    }

    public void reFuel(int fuelVolume) {
        tank.reFuel(fuelVolume);
    }

    public void distance() {
        System.out.print("Car brand: " + brand +
                        "\nCar color: " + body.getColor().name() +
                        "\nTank is " + tank.getVolume() +
                        "\nTotal distance: " + totalDistance +
                        "\nPressure in wheels: ");

        for (int i = 0; i < (wheels.length - 1); i++) {
            System.out.print(("wheel " + i + " has pressure " + wheels[i].getPressure() + ", "));
        }

        System.out.println(("wheel " + (wheels.length - 1) + " has pressure " + wheels[wheels.length - 1].getPressure() + "."));
    }

    public void stop() {
        if (engine.isOn()) {
            engine.stop();
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + "'" +
                ", color=" + body.getColor().name() +
                ", wheels=" + wheels[0].getDiameter() +
                '}';
    }
}
