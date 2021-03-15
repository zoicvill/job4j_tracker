package ru.job4j.oop;

public class Transport {
    public static void main(String[] args) {
        Vehicle litak = new Litak();
        Vehicle potyah = new Potyah();
        Vehicle bus = new Bus();

        Vehicle[] masVeh = new Vehicle[] {litak, potyah, bus};
        for (Vehicle v : masVeh) {
            v.move();
            v.passengers();
        }
    }

}
