package ru.job4j.ex;

public class Fact {
    public static void main(String[] args) {
     Fact fact = new Fact();
     fact.calc(-2);
    }
    public int calc(int n) {
        int rsl = 1;
        if (n < 0){
            throw new IllegalArgumentException("Некорректные параметры");
        }
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}
