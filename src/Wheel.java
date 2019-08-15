public class Wheel {

    private float pressure;
    private int diameter;

    Wheel() {
        this.pressure = 2.34f;
        this.diameter = 15;
    }

    Wheel(int diameter) {
        this.diameter = diameter;
    }

    void pump(float pressure) {
        this.pressure += pressure;
        System.out.println("Pumping your wheels for " + pressure +
                "\nNow pressure is " + this.pressure);
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
