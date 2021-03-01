package ru.job4j.tracker;

public class ConsoleOutput implements Output{
    @Override
    public void myPrintln(Object obj) {
        System.out.println(obj);
    }
}
