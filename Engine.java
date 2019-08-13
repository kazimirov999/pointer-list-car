public class Engine {

    private Tank tank;
    private Battery battery;
    public double milageFromEngine;
    private float volume;
    private float power;
    private static final float CONSUMPION = 0.1f;
    private boolean ignition = false;
    private boolean fuelAccess = false;

    public Engine(float volume, float power, int charge, float fuel) {
        this.volume = volume;
        this.power = power;
        this.battery = new Battery(charge);
        this.tank = new Tank(fuel);
    }

    void ignite() {
        if (battery.giveCharge() == 20) {
            ignition = true;

        } else {
            System.out.println("Battery LOW!!!");
        }

        if (tank.giveFuel() == 0.1f) {
            fuelAccess = true;
        } else {
            System.out.println("Fuel level LOW!!!");
        }

        if (ignition == true && fuelAccess == true) {
            System.out.println("Engine started");
        }
    }

    void work(float km) {
        if (ignition == true && fuelAccess == true) {
            tank.fuelFeed(volume * CONSUMPION * km);
            if (tank.getFuelVolume() <= 0) {
                tank.setFuelVolume(0);
                System.out.println("Tank is empty");
                milageFromEngine = volume * CONSUMPION;
            } else {
                System.out.println("Fuel left " + tank.getFuelVolume());
                milageFromEngine = km;
            }

            battery.reCharge();

        } else {
            System.out.println("Start the car first");
        }

    }

    void stop() {
        ignition = false;
        fuelAccess = false;
        System.out.println("Engine stoped");
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
    }

    public Tank getTank() {
        return tank;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }
}
