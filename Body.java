public class Body {
    private String color;
    private String brand;
    private Battery battery;
    private Tank tank;

    public Body(String color,String brand, Tank tank) {
        this.color = color;
        this.brand=brand;
        this.battery=new Battery(100);
        this.tank=tank;
    }

    void repaint(String color) {
        setColor(color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public Battery getBattery() {
        return battery;
    }

    public Tank getTank() {
        return tank;
    }
}
