public class Car {
    private Body body;
    private SteeringWheel steeringWheel;
    private Engine engine;
    private double milage;
    private Chassis chassis;

    public Car(Body body, SteeringWheel steeringWheel, Engine engine, Chassis chassis) {
        this.body = body;
        this.steeringWheel = steeringWheel;
        this.engine = engine;
        this.milage = 0;
        this.chassis = chassis;
    }
    
    void start(Battery battery, Tank tank) {
        engine.ignite(battery, tank);
    }

    void stop() {
        engine.stop();
    }

    void paint(String paint) {
        body.repaint(paint);
    }

    void changeFrontWheel(int index, Wheel wheel) {
        chassis.changeFrontWheel(index, wheel);
    }

    void changeBackWheel(int index, Wheel wheel) {
        chassis.changeBackWheel(index, wheel);
    }

    void drive(float km) {
        engine.work(body.getTank(),body.getBattery(),km);
        milage += engine.milageFromEngine;
        System.out.println("Milage: " + milage);
    }

    void turn(Chassis chassis,Direction direction) {
        steeringWheel.turn(chassis,direction);
    }

    void pumpAllWheelsTo(float p) {
        chassis.pumpAllTo(p);
    }

    void pumpAllWheelsToMax() {
        chassis.pumpToMax();
    }

    public Body getBody() {
        return body;
    }

    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public double getMilage() {
        return milage;
    }


    public Chassis getChassis() {
        return chassis;
    }
}
