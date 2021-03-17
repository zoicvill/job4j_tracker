package ru.job4j.function;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FuncDiapTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        FuncDiap function = new FuncDiap();
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenSquareTest() {
        FuncDiap function = new FuncDiap();
        List<Double> result = function.diapason(2, 4, x -> x * x + 1);
        List<Double> expected = Arrays.asList(5D, 10D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenDegreeTest() {
        FuncDiap function = new FuncDiap();
        List<Double> result = function.diapason(2, 5, x -> Math.pow(3, x) + 1);
        List<Double> expected = Arrays.asList(10D, 28D, 82D);
        assertThat(result, is(expected));
    }

}