package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamList {
    public static void main(String[] args) {
        List<Integer> listStr = new ArrayList<>();
        for (int i = -15; i < 10; i++) {
            listStr.add(i);
        }

        List<Integer> str = listStr.stream().
                filter(x -> x >= 0).
                collect(Collectors.toList());
        str.forEach(System.out::println);
    }

}
