public class Car {
    private Body body;
    private SteeringWheel steeringWheel;
    private Engine engine;
    private double milage;
    private String brand;

    public Car(Body body, SteeringWheel steeringWheel, Engine engine,String brand) {
        this.body = body;
        this.steeringWheel = steeringWheel;
        this.engine = engine;
        this.milage = 0;
        this.brand=brand;
    }

    void start() {
        engine.ignite();
    }

    void stop() {
        engine.stop();
    }

    void paint(String paint) {
        body.repaint(paint);
    }

    void changeFrontWheel(int index, Wheel wheel) {
        steeringWheel.chassis.changeFrontWheel(index, wheel);
    }

    void changeBackWheel(int index, Wheel wheel) {
        steeringWheel.chassis.changeBackWheel(index, wheel);
    }

    void drive(float km) {
        engine.work(km);
        milage += engine.milageFromEngine;
        System.out.println("Milage: " + milage);
    }

    void turn(Direction direction) {
        steeringWheel.turn(direction);
    }

    void pumpAllWheelsTo(float p) {
        steeringWheel.chassis.pumpAllTo(p);
    }

    void pumpAllWheelsToMax() {
        steeringWheel.chassis.pumpToMax();
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(SteeringWheel steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
