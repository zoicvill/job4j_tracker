package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class StudentLevel {

    public static List<Student> levelOf(List<Student> students, int bon) {
        return students.stream()
                .filter(Objects::nonNull)
                .sorted((left, right) ->
                        Integer.compare(right.getScore(), left.getScore()))
                .takeWhile(st -> st.getScore() > bon)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Map.of("first", 1, "second", 2)
                .forEach((k, v) -> System.out.println(v + " " + k));
    }
}
