package ru.job4j.collection;

import java.util.Arrays;
import java.util.Comparator;

public class StringCompare implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        String[] s1 = o1.split("");
        String[] s2 = o2.split("");
        return Arrays.compare(s1,s2);
    }
}
