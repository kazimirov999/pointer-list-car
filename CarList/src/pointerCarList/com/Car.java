package pointerCarList.com;

public class Car {
    String names;
    String years;
    int radius;
    String color;
    String body;
    boolean sWB;


     Car(String names, String years, int radius, String color, String body, boolean sWB) {
         this.names = names;
        this.years = years;
        this.radius = radius;
        this.color = color;
        this.body = body;
        this.sWB = sWB;


    }

    Car(String names, String years, String color, String body) {
         this.names = names;
         this.years = years;
         this.color = color;
         this.body = body;

    }

    public String getNames() {
        return names;
    }

    public String setNames(String names) {
        return names;
    }

    public String getYears() {
        return years;
    }

    public Integer setYears(Integer years) {
        return years;
    }

    public int getRadius() {
        return radius;
    }

    public String setRadius(String radius) {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public String setColor(String color) {
        return color;
    }

    public String getBody() {
        return body;
    }

    public String setBody(String body) {
        return body;
    }

    public  boolean getsWm(){ return sWB;}
}

