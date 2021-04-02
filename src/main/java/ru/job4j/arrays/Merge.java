package ru.job4j.arrays;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] res = new int[left.length + right.length];
        int iLeft = 0, jRight = 0, xRes = 0, x = 0;
        while (iLeft < left.length && jRight < right.length) {
            res[xRes++] = left[iLeft] < right[jRight] ? left[iLeft++] : right[jRight++];
        }
        while (iLeft < left.length) {
            res[xRes++] = left[iLeft++];
        }
        while (jRight < right.length) {
            res[xRes++] = right[jRight++];
        }

        return res;
    }
}
