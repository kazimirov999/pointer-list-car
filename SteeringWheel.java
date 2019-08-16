public class SteeringWheel {
    private float position;
    private String type;
    static final String DEFAULT_TYPE = "MK_1";

    public SteeringWheel() {
        this.type = DEFAULT_TYPE;
    }

    public void turn(Chassis chassis, Direction direction) {
        position += direction.getDegree();
        System.out.println("Sterring wheel position: " + position);
        chassis.turn(direction.name());
    }

    void changeSteeringWheel(String type) {
        this.type = type;
    }

    void honk() {
        if (type != "MK_1") {
            System.out.println("*Car horn sound*");
        }
    }

    public float getPosition() {
        return position;
    }

    public void setPosition(float position) {
        this.position = position;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
