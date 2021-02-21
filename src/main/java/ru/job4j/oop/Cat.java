package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    public static void main(String[] args) {
        System.out.println("There are gav's food");
        Cat gav = new Cat();
        gav.eat("Котлету");
        gav.giveNick("Гав");
        gav.show();

        System.out.println("There are black's food");
        Cat black = new Cat();
        black.eat("рыбу");
        black.giveNick("Арнольд");
        black.show();

    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void show() {
        System.out.println("Меня зовут " + this.name);
        System.out.println("Я люблю есть " + this.food + "\n");
    }

}
