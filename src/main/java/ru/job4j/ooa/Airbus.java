package ru.job4j.ooa;

public final class Airbus extends Aircraft{
    private static int COUNT_ENGINE;
    private String name;

    public Airbus(String name, int COUNT_ENGINE) {
        this.name = name;
        Airbus.COUNT_ENGINE = COUNT_ENGINE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printModel() {
        System.out.println("Модель самолета: " + name);
    }

    public void printCountEngine() {
        System.out.println("Количество двигателей равно: " + COUNT_ENGINE);
    }

    @Override
    public String toString() {
        return "Airbus{"
                + "name='" + name + '\''
                + '}';
    }
}
