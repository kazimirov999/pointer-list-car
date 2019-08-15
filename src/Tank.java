public class Tank {
    private float fuelVolume;
    Tank(float fuelVolume){
        this.fuelVolume = fuelVolume;
    }
    Tank(){
    }
    public float getFuelVolume() {
        return fuelVolume;
    }
    public void setFuelVolume(float fuelVolume){
        this.fuelVolume = fuelVolume;
    }
    void reFuel(float fuelVolume) {
        this.fuelVolume += fuelVolume;
        System.out.println("Filling the car for " + fuelVolume + " litres of fuel" +
                "\nTotal fuel volume is " + this.fuelVolume + " litres now");
    }
    boolean hasFuel(){
        if(fuelVolume != 0){
            return true;
        }
        return false;
    }
}
