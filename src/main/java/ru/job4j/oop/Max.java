package ru.job4j.oop;

public class Max {

    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int center) {
        return max(left,max(right,center));
    }

    public static int max(int left, int right, int center, int fin) {
        return max(left, max(right,center,fin));
    }

}
