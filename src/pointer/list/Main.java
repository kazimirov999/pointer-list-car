package pointer.list;

public class Main {

    public static void main(String[] args) {
        CarManager manager = new CarManager(System.in);

        System.out.println(manager.getAllCars());
        manager.exitIfEmpty();

        //1) Знайти машини, які мають введений діаметр коліс.
        //2) Знайти машини, які мають введений діаметр коліс та колір кузова.
        manager.doSearch();

        //3) Замінити в усіх машинах, які мають червоний колір кузова, кермо на інше.
        manager.changeSteeringWheel();

        //4) Збільшити діаметр коліс вдвічі, якщо кермо має кнопочки.
        manager.makeDoubleWheelsDiameter();
        //5) Замінити усі машини, які мають колеса діаметром менші за введене значення, на інші машини.
        manager.changeCarsWithSmallDiameter();
        System.out.println(manager.getAllCars());

        manager.close();
    }
}