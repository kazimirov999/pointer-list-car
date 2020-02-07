public class SteeringWheel {
    private boolean buttonsOnSteeringWheel;
    private int radiusSteeringWheel;

    public SteeringWheel(boolean buttonsOnSteeringWheel, int radiusSteeringWheel) {
        this.buttonsOnSteeringWheel = buttonsOnSteeringWheel;
        this.radiusSteeringWheel = radiusSteeringWheel;
    }

    public boolean areButtonsOnSteeringWheel() {
        return buttonsOnSteeringWheel;
    }

    public void setButtonsOnSteeringWheel(boolean buttonsOnSteeringWheel) {
        this.buttonsOnSteeringWheel = buttonsOnSteeringWheel;
    }

    public int getRadiusSteeringWheel() {
        return radiusSteeringWheel;
    }

    public void setRadiusSteeringWheel(int radiusSteeringWheel) {
        this.radiusSteeringWheel = radiusSteeringWheel;
    }
}
