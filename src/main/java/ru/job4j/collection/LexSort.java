package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String reg = "[a-z A-Z_.]";
        String[] lStr = left.split(reg,2);
        String[] rStr = right.split(reg,2);
        int lRes = Integer.parseInt(lStr[0]);
        int rRes = Integer.parseInt(rStr[0]);
        return Integer.compare(lRes,rRes);
    }
}
