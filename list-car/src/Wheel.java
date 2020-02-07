public class Wheel {

    private int diameter;
    private double pressure;

    public Wheel(int diameter, double pressure) {
        this.diameter = diameter;
        this.pressure = pressure;
    }

    public Wheel(double pressure, int diameter) {
        this.diameter = diameter;
        this.pressure = pressure;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    @Override
    public String toString() {
        return "У вас встановленi диски --> " + diameter + "-го діаметру\nШини накачаннi до тиску --> " + pressure + " атм\n";
    }
}
