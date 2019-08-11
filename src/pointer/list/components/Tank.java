package pointer.list.components;

public class Tank {
    private int tank;
    private float fuel;


    public Tank(int tank) {
        this.tank = tank;
    }

    public int getVolume() {
        return tank;
    }

    public float getFuel() {
        return fuel;
    }

    public float setFuel(float fuel) {
        this.fuel = fuel;

        if (isFull()) {
            float extraFuel = fuel - tank;
            this.fuel = tank;
            return extraFuel;
        }

        return 0;
    }

    public boolean isFull() {
        return fuel > tank;
    }

    public boolean isEmpty() {
        return fuel == 0;
    }

    public void reFuel(int fuelVolume){
        System.out.println("You're re-fuel with : " + fuelVolume + " litters.");

        float extraFuel = setFuel(fuel + fuelVolume);

        if (extraFuel != 0) {
            System.out.println("The tank is full. Not all fuel are needed. Fuel left: " + extraFuel);
        } else {
            System.out.println("The tank has " + fuel + " litters.");
        }
    }
}
