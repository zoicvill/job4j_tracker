package ru.job4j.ex;

import java.util.Arrays;

public class BackArray {
    public static void main(String[] args) {
        String[] names = {"Petr", "Ivan", "Nik", "Vasya"};
        int middle = names.length / 2;
        for (int i = 0; i <= middle; i++) {
            String temp = names[i];
            names[i] = names[middle - i];
            names[middle - i] = temp;
        }
        System.out.println(Arrays.toString(names));
    }
}
