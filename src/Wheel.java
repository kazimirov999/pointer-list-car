import java.util.Arrays;
import java.util.Objects;

public class Wheel {
    private int[] wheels = new int[4];
    private int wheelRadius;

    public Wheel(int wheelRadius) {
        this.wheelRadius = wheelRadius;
    }

    public int getWheelRadius() {
        return wheelRadius;
    }

    public int[] getWheels() {
        return wheels;
    }

    public void setWheels(int[] wheels) {
        this.wheels = wheels;
    }

    public void setWheelRadius(int wheelRadius) {
        this.wheelRadius = wheelRadius;
    }

    public void set_Wheel_Radius(int i) {
        wheels[0] = wheelRadius;
        wheels[1] = wheelRadius;
        wheels[2] = wheelRadius;
        wheels[3] = wheelRadius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wheel wheel = (Wheel) o;
        return wheelRadius == wheel.wheelRadius &&
                Arrays.equals(wheels, wheel.wheels);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(wheelRadius);
        result = 31 * result + Arrays.hashCode(wheels);
        return result;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "wheels=" + Arrays.toString(wheels) +
                ", wheelRadius=" + wheelRadius +
                '}';
    }
}
