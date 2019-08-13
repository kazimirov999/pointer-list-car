public class Body {

    private Colors color;

    Body(String color) {
        this.color = Colors.valueOf(color.toUpperCase());
    }

    void clean() {
        System.out.println("Your " + color.toString() + " car is washed");
    }

    public Colors getColor() {
        return color;
    }
}