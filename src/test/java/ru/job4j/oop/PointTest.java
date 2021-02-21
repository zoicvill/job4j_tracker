package ru.job4j.oop;


import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void whenDistance0020() {
        Point first = new Point(0, 0);
        Point second = new Point(2, 0);
        double result = first.distance(second);
        double expected = 2.0;
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void whenDistanceM1m111() {
        Point first = new Point(-1, -1);
        Point second = new Point(1, 1);
        double result = first.distance(second);
        double expected = 2.828;
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void whenDistance1133() {
        Point first = new Point(1, 1);
        Point second = new Point(3, 3);
        double result = first.distance(second);
        double expected = 2.828;
        Assert.assertEquals(expected, result, 0.01);
    }


}