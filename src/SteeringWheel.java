import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SteeringWheel that = (SteeringWheel) o;
        return buttonsOnSteeringWheel == that.buttonsOnSteeringWheel &&
                radiusSteeringWheel == that.radiusSteeringWheel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(buttonsOnSteeringWheel, radiusSteeringWheel);
    }

    @Override
    public String toString() {
        return "SteeringWheel{" +
                "buttonsOnSteeringWheel=" + buttonsOnSteeringWheel +
                ", radiusSteeringWheel=" + radiusSteeringWheel +
                '}';
    }
}
