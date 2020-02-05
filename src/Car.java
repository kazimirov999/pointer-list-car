public class Car {
    private String mark;
    private String model;
    SteeringWheel steeringWheel;
    Wheel wheel;
    Body body;

    Car() {
        mark = "defaulted";
        model = "defaulted";
        this.steeringWheel = new SteeringWheel(false, 0);
        this.wheel = new Wheel(0);
        this.body = new Body("defaulted");
    }

    Car(String markCar, String modelCar, int steeringWheelRadius, boolean steeringWheelButton, int wheelRadius, String color) {
        mark = markCar;
        model = modelCar;
        this.steeringWheel = new SteeringWheel(steeringWheelButton, steeringWheelRadius);
        this.wheel = new Wheel(wheelRadius);
        this.body = new Body(color);
    }


    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
