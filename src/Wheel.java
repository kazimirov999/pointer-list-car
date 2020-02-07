import java.util.Arrays;

public class Wheel {
    private int[]wheels= new int[4];
    private int wheelRadius;

    public Wheel(int wheelRadius){
        this.wheelRadius=wheelRadius;
    }
    public int getWheelRadius(){
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
    public void set_Wheel_Radius(int i){
        wheels[0]=wheelRadius;
        wheels[1]=wheelRadius;
        wheels[2]=wheelRadius;
        wheels[3]=wheelRadius;

    }
}
