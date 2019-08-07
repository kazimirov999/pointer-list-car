package pointer.list.components;

public class Tank {
    private int tank;
    private float fuel;

    public Tank(int tank, int fuel) {
        this.tank = tank;
        this.fuel = fuel;
    }

    public Tank(int tank) {
        this.tank = tank;
    }

    public int getVolume() {
        return tank;
    }

    public float getFuel() {
        return fuel;
    }

    public void setFuel(float fuel) {
        this.fuel = fuel;
    }

    boolean isFull() {
        return fuel < tank;
    }

    public boolean isEmpty() {
        return fuel == 0;
    }

    public void reFuel(int fuelVolume){
        System.out.println("You're re-fuel with : " + fuelVolume + " litters.");
        fuel += fuelVolume;

        if (isFull()) {
            System.out.println("The tank is full. Not all fuel are needed. Fuel left: " + (fuel - tank));
            fuel = tank;
        } else {
            System.out.println("The tank has " + fuel + " litters.");
        }
    }
}
