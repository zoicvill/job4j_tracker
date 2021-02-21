package ru.job4j.oop;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {
    private int x;
    private int y;

    public Point(int xFirst, int ySecond) {
        this.x = xFirst;
        this.y = ySecond;
    }

    public double distance(Point point){
        return sqrt(pow(this.x - point.x, 2) + pow(this.y - point.y, 2));
    }

    public static void main(String[] args) {
    Point p = new Point(3,6);
    Point p2 = new Point(2,30);
    p.distance(p2);
    p2.distance(p);
    System.out.println(p.distance(p2) +"\n" + p2.distance(p));
    }
}
