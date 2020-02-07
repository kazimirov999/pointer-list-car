public class Car {

    private String brand;
    private int maxSpeed;
    private int motorVolume;

    public Body body;
    public Wheel wheels;
    public SteeringWheel steeringWheel;

    public Car(String brand, int maxSpeed, int motorVolume) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.motorVolume = motorVolume;
        this.body = new Body("зелений", "ліфтбек");
        this.wheels = new Wheel(17, 2.0);
        this.steeringWheel = new SteeringWheel();
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMotorVolume() {
        return motorVolume;
    }

    public void setMotorVolume(int motorVolume) {
        this.motorVolume = motorVolume;
    }

    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(int buttons) {
        this.steeringWheel = new SteeringWheel();
    }

    @Override
    public String toString() {
        return "Автомобіль марки ---------> " + brand + "\n" + wheels.toString() + body.toString();
    }
}
