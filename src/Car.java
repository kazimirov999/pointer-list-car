import java.util.Objects;

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
        this.body = new Body(Color.WHITE);
        this.steeringWheel = new SteeringWheel(false, 5);
        this.wheel = new Wheel(30);
    }

    public Car(String brandauto, String modelauto, Color color, int wheelRadius, int radiusSteeringWheel, boolean buttonsOnSteeringWheel) {
        this.brand = brandauto;
        this.model = modelauto;
        this.wheel = new Wheel(wheelRadius);
        this.body = new Body(color);
        this.steeringWheel = new SteeringWheel(buttonsOnSteeringWheel, radiusSteeringWheel);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(brand, car.brand) &&
                Objects.equals(model, car.model) &&
                Objects.equals(body, car.body) &&
                Objects.equals(wheel, car.wheel) &&
                Objects.equals(steeringWheel, car.steeringWheel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, body, wheel, steeringWheel);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", body=" + body +
                ", wheel=" + wheel +
                ", steeringWheel=" + steeringWheel +
                '}';
    }
}
