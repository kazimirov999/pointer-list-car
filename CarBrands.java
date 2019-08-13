public enum CarBrands {

    AUDI(3.0f), BMW(2.0f), DODGE(3.8f), HONDA(1.5f), TOYOTA(5.7f);

    private float engiveVolume;

    CarBrands(float engiveVolume) {
        this.engiveVolume = engiveVolume;
    }


    static void showAll() {
        for (CarBrands cB : CarBrands.values()) {
            System.out.println(cB.toString());
        }
    }

    public float getEngiveVolume() {
        return engiveVolume;
    }

    public void setEngiveVolume(float engiveVolume) {
        this.engiveVolume = engiveVolume;
    }
}
