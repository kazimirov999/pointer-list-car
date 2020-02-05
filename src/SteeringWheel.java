public class SteeringWheel {
    private boolean steeringWheelButton;
    private int steeringWheelRadius;

    public SteeringWheel(boolean steeringWheelButton, int steeringWheelRadius) {
        this.steeringWheelButton = steeringWheelButton;
        this.steeringWheelRadius = steeringWheelRadius;
    }

    public boolean isSteeringWheelButton() {
        return steeringWheelButton;
    }

    public void setSteeringWheelButton(boolean steeringWheelButton) {
        this.steeringWheelButton = steeringWheelButton;
    }

    public int getSteeringWheelRadius() {
        return steeringWheelRadius;
    }

    public void setSteeringWheelRadius(int steeringWheelRadius) {
        this.steeringWheelRadius = steeringWheelRadius;
    }
}
