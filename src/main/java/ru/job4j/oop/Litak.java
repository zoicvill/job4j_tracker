package ru.job4j.oop;

public class Litak implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " Летаю");
    }

    @Override
    public void passengers() {
        System.out.println("Всего пассажиров: 150");
    }
}
