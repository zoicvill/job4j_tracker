package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int per) {
        this.load = per;
    }

    public static void main(String[] args) {
        Battery height = new Battery(70);
        Battery low = new Battery(20);
        System.out.println(height.load + " " + low.load);
        height.exchange(low);
        System.out.println(height.load + " " + low.load);
    }

    public void exchange(Battery another) {
        another.load += this.load;
        this.load = 0;
    }
}
