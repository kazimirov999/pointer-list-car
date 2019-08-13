public class Wheel {

    private float pressure;
    private int diameter;

    Wheel() {
        this(2.34f, 15);
    }

    Wheel(float pressure) {
        this.pressure = pressure;
    }

    Wheel(float pressure, int diameter) {
        this.pressure = pressure;
        this.diameter = diameter;
    }

    Wheel(int diameter) {
        this.diameter = diameter;
    }

    void pump(float pressure) {
        this.pressure += pressure;
        System.out.println("Pumping your wheels for " + pressure + "\n" +
                "Now pressure is " + this.pressure);
    }

    public float getPressure() {
        return pressure;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }
}
