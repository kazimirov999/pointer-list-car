public class Wheel {

    private float pressure;
    private static final float MAX_PRESSURE = 3.2f;

    public Wheel(float pressure) {
        this.pressure = pressure;
    }

    void pumpToMax() {
        pressure = MAX_PRESSURE;
    }

    void pumpAlltoMax(Wheel[] wheels) {
        for (Wheel w : wheels) {
            w.pumpToMax();
        }
    }

    void pumpTo(float p) {
        pressure = pressure + p;
    }

    public float getPressure() {
        return pressure;
    }

}
