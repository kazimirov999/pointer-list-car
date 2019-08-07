package pointer.list.components;

public class Engine {
    private float volume;
    private float power;
    private float gasUsage;
    private boolean isStarted;

    public Engine(float volume, float power, float gasUsage) {
        this.volume = volume;
        this.power = power;
        this.gasUsage = gasUsage;
    }

    public boolean isOn(){
        return isStarted;
    }

    public float getGasUsage(){
        return gasUsage;
    }

    public void ingine(){
        isStarted = true;
        System.out.println("Engine is started. Engine volume is " + volume + ", power is " + power + ".");
    }

    public void stop() {
        isStarted = false;
        System.out.println("Engine is stopped.");
    }
}
