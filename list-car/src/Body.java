public class Body {

    private String color;
    private String bodyType;

    public Body(String color, String bodyType) {
        this.color = color;
        this.bodyType = bodyType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public String toString() {
        return "Колiр вашої машини -------> " + color + "\nТип кузова ---------------> " + bodyType + "\n";
    }
}
