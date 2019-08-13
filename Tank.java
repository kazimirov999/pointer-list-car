public class Tank {

    private float fuelVolume;
    private static final float MAX_FUEL_VOLUME = 150.0f;

    public Tank(float fuelVolume) {
        if (fuelVolume > 0) {
            if (fuelVolume <= MAX_FUEL_VOLUME) {
                this.fuelVolume = fuelVolume;
                System.out.println("Fuel level: " + fuelVolume);
            } else {
                this.fuelVolume = MAX_FUEL_VOLUME;
                System.out.println("Fuel MAX");
            }
        } else {
            System.out.println("No Fuel");
            this.fuelVolume = 0;
        }
    }

    float giveFuel() {
        float drop = 0.1f;
        fuelVolume = fuelVolume - drop;
        return drop;
    }

    void fuelFeed(float fuel) {
        fuelVolume = fuelVolume - fuel;
    }

    void reFuel(float fuel) {
        fuelVolume = fuelVolume + fuel;
        if (fuelVolume > MAX_FUEL_VOLUME) {
            fuelVolume = MAX_FUEL_VOLUME;
            System.out.println("Fuel level:" + fuelVolume);
        } else {
            System.out.println("Fuel level: " + fuelVolume);
        }

    }

    public float getFuelVolume() {
        return fuelVolume;
    }

    public void setFuelVolume(float fuelVolume) {
        this.fuelVolume = fuelVolume;
    }
}
