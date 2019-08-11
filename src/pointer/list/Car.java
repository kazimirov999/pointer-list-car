package pointer.list;

import pointer.list.components.*;

public class Car {
    private String brand;
    private float totalDistance;

    private SteeringWheel steeringWheel = new SteeringWheel(false);
    private Engine engine;
    private Wheel[] wheels;
    private final Body body;
    private Tank tank;

    public Car(String brand, Color carColor, Wheel... wheels) {
        this.brand = brand;
        this.body = new Body(carColor);
        this.wheels = wheels;
        this.tank = new Tank(60);
        this.engine = new Engine(2.0f, 120, 8.1f);
        pumpWheels();
    }

    public void setEngine(float volume, int power, float gasUsage) {
        this.engine = new Engine(volume, power, gasUsage);
    }

    public void setTank(int tank) {
        this.tank = new Tank(tank);
    }

    public Color getColor() {
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

    private void pumpWheels() {
        for (Wheel wheel : wheels) {
            wheel.pump();
        }

        System.out.println("Wheels are pumped.");
    }

    public void changeWheelsDiameter(float multiply) {
        for (Wheel wheel : wheels) {
            wheel.setDiameter(multiply * wheel.getDiameter());
        }

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

    public float getWheelsDiameter() {
        return wheels.length > 0 ? wheels[0].getDiameter() : 0;
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
