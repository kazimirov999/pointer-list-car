public class SteeringWheel {

    private boolean heating;
    private int volume;
    public int buttons = 5;

    public int getButtons() {
        return buttons;
    }

    public void setButtons(int buttons) {
        this.buttons = buttons;
    }

    public SteeringWheel() {
    }

    public boolean isHeating() {
        return heating;
    }

    public void heatingOn() {
        this.heating = true;
    }

    public void heatingOff() {
        this.heating = false;
    }

    public void playMusik(int volume) {
        this.volume = volume;
    }

    public void stopMusik() {
        this.volume = 0;
    }

    public int getVolume() {
        return volume;
    }

    public void volumeUp(int volume) {
        this.volume += volume;
    }

    public void volumeDown(int volume) {
        this.volume -= volume;
    }

    @Override
    public String toString() {
        if (heating == true && volume > 0) {
            return "Пiдiгрiв керма ввiмкнений\nМузик грає з гучнiстю " + volume + " одиниць";
        }
        if (heating == false && volume > 0) {
            return "Пiдiгрiв керма вимкнений\nМузик грає з гучнiстю " + volume + " одиниць";
        } else return "Пiдiгрiв керма вимкнений\nМузика вимкнена\n";
    }

}
