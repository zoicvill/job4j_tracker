package ru.job4j.oop;

import junit.framework.TestCase;
import org.junit.Test;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

public class TriangleTest{

    @Test
    public void periodTest(){
        Point p1 = new Point(0,0);
        Point p2 = new Point(4,0);
        Point p3 = new Point(0,4);
        Triangle triangle = new Triangle(p1,p2,p3);
        double rsl = triangle.area();
        assertThat(rsl, closeTo(8, 0.001));

    }

}