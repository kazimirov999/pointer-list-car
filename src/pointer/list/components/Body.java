package pointer.list.components;

import pointer.list.Color;

public class Body {
    private Color color;

    public Body(Color color) {
        this.color = color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void clean() {
        System.out.println("Car body is clean");
    }
}
