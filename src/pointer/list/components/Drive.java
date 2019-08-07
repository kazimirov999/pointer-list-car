package pointer.list.components;

public class Drive implements Direction {

    private final float degree;
    private final int distance;


    public Drive(float degree, int distance) {
        this.degree = degree;
        this.distance = distance;
    }

    public float getDegree() {
        return degree;
    }

    public int getDistance() {
        return distance;
    }
}
