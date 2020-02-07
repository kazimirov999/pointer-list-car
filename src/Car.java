public class Car {
    private String brand;
    private String model;
    Body body;
    Wheel wheel;
    SteeringWheel steeringWheel;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Car() {
        brand = "standart";
        model = "standart";
        this.body = new Body("stock");
        this.steeringWheel = new SteeringWheel(false, 5);
        this.wheel = new Wheel(12);
    }

    public Car(String brandauto, String modelauto, String color, int wheelRadius, int radiusSteeringWheel, boolean buttonsOnSteeringWheel) {
        this.brand = brandauto;
        this.model = modelauto;
        this.wheel = new Wheel(wheelRadius);
        this.body = new Body(color);
        this.steeringWheel = new SteeringWheel(buttonsOnSteeringWheel, radiusSteeringWheel);

    }
}
