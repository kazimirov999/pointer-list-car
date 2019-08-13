public class Battery {

    private int charge;
    private static final int MAX_CHARGE = 100;

    public Battery(int charge) {
        if (charge > 0) {
            if (charge <= MAX_CHARGE) {
                this.charge = charge;
            } else {
                this.charge = MAX_CHARGE;
                System.out.println("Battary MAX");
            }
        } else {
            System.out.println("No charge");
            this.charge = 0;
        }
    }


    int giveCharge() {
        int spark = 20;
        charge = -spark;
        return spark;
    }

    void reCharge() {
        charge = MAX_CHARGE;
    }

    public int getCharge() {
        return charge;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }
}
