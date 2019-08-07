package pointer.list.components;

public class Wheel {
    private float pressure;
    private float diameter;

    public Wheel(float diameter) {
        this.diameter = diameter;
    }

    public float getPressure() {
        return pressure;
    }

    public float getDiameter() {
        return diameter;
    }

    public void pump() {
        pressure = diameter <= 1.0 ? 2.1f : (diameter <= 2.5) ? 2.7f : 3.5f;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }
}
