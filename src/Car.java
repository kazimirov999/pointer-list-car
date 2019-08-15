public class Car {
    private String name;
    SteeringWheel steeringWheel;
    Wheel wheels;
    Body body;
    Engine engine;

    Car(String name, Engine engine, Body body, SteeringWheel steeringWheel, Wheel wheels) {
        this.name = name;
        this.engine = engine;
        this.body = body;
        this.steeringWheel = steeringWheel;
        this.wheels = wheels;
    }

    Car() {
        name = "Unknown";
        this.engine = new Engine(0, 100);
        this.body = new Body("Black");
        this.steeringWheel = new SteeringWheel(false);
        this.wheels = new Wheel(15);
    }

    void start() {
        engine.engage();
    }

    public String getName() {
        return name;
    }


}