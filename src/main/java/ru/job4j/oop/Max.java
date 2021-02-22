package ru.job4j.oop;

public class Max {

    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int center) {
        return left > max(right, center) ? left : max(right, center);
    }

    public static int max(int left, int right, int center, int fin) {
        return left > max(right, center, fin) ? left : max(right, center, fin);
    }

}
