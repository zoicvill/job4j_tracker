package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MatrixLIst {
    public static List<Integer> overMatrix(Integer[][] mtrx) {
        return Stream.of(mtrx).flatMap(Stream::of).collect(Collectors.toList());
    }
}
