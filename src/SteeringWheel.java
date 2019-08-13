public class SteeringWheel {

    private String steeringWheelType;
    private float position;

    SteeringWheel(float position) {
        this.position = position;
        this.steeringWheelType = "Common";
    }

    SteeringWheel(float position, String steeringWheelType) {
        this.position = position;
        this.steeringWheelType = steeringWheelType;
    }

    SteeringWheel() {
        this(180, "Common");
    }

    void turn(float angle) {
        this.position += angle;

        System.out.println("You're turning for " + angle + " angles\n" +
                "Your steering wheel's position is at " + position + " angles now");
    }

    public float getPosition() {
        return position;
    }
    public void setSteeringWheelType(String steeringWheelType) {
        this.steeringWheelType = steeringWheelType;
    }
    public String getSteeringWheelType() {
        return steeringWheelType;
    }
}
