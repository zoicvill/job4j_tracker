package ru.job4j.oop;

public class Bus implements Vehicle{
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " Езжу на дороге");
    }

    @Override
    public void passengers() {
        System.out.println("Всего пассажиров: 60");
    }
}
