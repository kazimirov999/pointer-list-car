public class Engine {
    private float fuelVolume;
    private float power;

    Engine(float fuelVolume, float power) {
        this.fuelVolume = fuelVolume;
        this.power = power;
    }

    Engine(float power) {
        this.power = power;
    }

    Engine() {
        this(0, 0);
    }

    void engage() {
        if (fuelVolume == 0) {
            System.out.println("You have not enough fuel. Fill the car first.");
        } else {
            System.out.println("The car is on.");
        }
    }

    void reFuel(float fuelVolume) {
        this.fuelVolume += fuelVolume;
        System.out.println("Filling the car for " + fuelVolume + " litres of fuel\n" +
                "Total fuel volume is " + this.fuelVolume + " litres now");
    }

    public float getFuelVolume() {
        return fuelVolume;
    }

    public float getPower() {
        return power;
    }
}