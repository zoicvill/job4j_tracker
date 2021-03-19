package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixLIstTest {
    @Test
    public void whenMatrixTest() {
        Integer[][] matrix = {{10, 20, 20},
                {56, 100, 59}, {10, 89, 16}, {3}};
        List<Integer> exp = List.of(
                10, 20, 20, 56, 100, 59, 10, 89, 16, 3
        );
        assertThat(MatrixLIst.overMatrix(matrix), is(exp));
    }
}