public class SteeringWheel {

    private boolean isMuiltifunctioned;
    private float position = 180;

    SteeringWheel(boolean isMuiltifunctioned) {
        this.isMuiltifunctioned = isMuiltifunctioned;
    }

    void turn(float angle) {
        this.position += angle;

        System.out.println("You're turning for " + angle + " angles" +
                "\nYour steering wheel's position is at " + position + " angles now");
    }

    public float getPosition() {
        return position;
    }

    public void setType(boolean isMuiltifunctioned) {
        this.isMuiltifunctioned = isMuiltifunctioned;
    }

    public boolean isMuiltifunctioned() {
        return isMuiltifunctioned;
    }
}
