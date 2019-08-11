package pointer.list.components;

public class SteeringWheel {
    private float position;
    private final boolean buttons;

    public SteeringWheel(boolean hasButtons) {
        this.buttons = hasButtons;
    }

    public void turn(Direction direction) {
        position += direction.getDegree();
        System.out.println("Steering wheel position: " + position);
    }

    public boolean hasButtons() {
        return buttons;
    }
}
