public enum CarBrands {
    AUDI("AUDI", 3.0f, 233,70),
    BMW("BWM", 2.0f,184,70),
    DODGE("DODGE", 3.8f,215,76),
    HONDA("HONDA", 1.5f,86,70),
    TOYOTA("TOYOTA", 5.7f,386,99);

    private float engiveVolume;
    private String title;
    private int enginePower;
    private float tankMaxVolume;

    CarBrands(String title, float engiveVolume, int enginePower, float tankMaxVolume) {
        this.engiveVolume = engiveVolume;
        this.title = title;
        this.enginePower=enginePower;
        this.tankMaxVolume=tankMaxVolume;
    }


    static void showAll() {
        for (CarBrands cB : CarBrands.values()) {
            System.out.println(cB.toString());
        }
    }

    public String getTitle() {
        return title;
    }

    public float getEngiveVolume() {
        return engiveVolume;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public float getTankMaxVolume() {
        return tankMaxVolume;
    }
}
