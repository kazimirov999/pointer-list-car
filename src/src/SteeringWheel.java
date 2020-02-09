public class SteeringWheel {

    private int amountButtons;
    private int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public int getButtons() {
        return amountButtons;
    }

    public SteeringWheel(int amountButtons, int radius) {
        this.amountButtons = amountButtons;
        this.radius = radius;
    }



}
