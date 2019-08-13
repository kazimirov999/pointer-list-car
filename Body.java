public class Body {

    private String color;

    public Body(String color) {
        this.color = color;
    }

    void repaint(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
