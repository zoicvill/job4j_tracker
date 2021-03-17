package ru.job4j.function;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaUsage {

    public static void main(String[] args) {

        List<String> list = Arrays.asList(
                "Aaaaa",
                "Bbbbbb",
                "Cccccc",
                "Ddddddd");

        Comparator<String> comp = (s, s1) -> {
            System.out.println(s + " " + s1);
            return s1.compareTo(s);
        };

        list.sort(comp);
        System.out.println();
        for (String s : list) {
            System.out.println(s);
        }

    }

}
