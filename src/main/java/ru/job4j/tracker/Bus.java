package ru.job4j.tracker;

public class Bus implements Transport {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.goTrans();
        bus.tankUp(50);
        bus.passTrans(70);
    }

    @Override
    public void goTrans() {
        System.out.println("Автобус едет");
    }

    @Override
    public void passTrans(int qanPass) {
        System.out.println("Пассажиров в автобусе " + qanPass);
    }

    @Override
    public int tankUp(int gasoline) {
        System.out.println("Стоимость пути " + gasoline * 50 + " руб.");
        return gasoline * 50;
    }
}
