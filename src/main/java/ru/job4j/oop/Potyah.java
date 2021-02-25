package ru.job4j.oop;

public class Potyah implements Vehicle{
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " Езжу на рельсам");
    }

    @Override
    public void passengers() {
        System.out.println("Всего пассажиров: 1550");
    }
}
