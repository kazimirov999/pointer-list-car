public class Engine {
    private float power;
    Tank tank = new Tank();

    Engine(float power, float fuelVolume) {
        this.power = power;
        tank.setFuelVolume(fuelVolume);
    }

    void engage() {
        if (tank.hasFuel()) {
            System.out.println("The car is on.");
        } else {
            System.out.println("You have not enough fuel. Fill the car first.");
        }
    }

    public float getPower() {
        return power;
    }
}