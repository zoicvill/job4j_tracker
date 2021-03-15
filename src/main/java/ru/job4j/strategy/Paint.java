package ru.job4j.strategy;

public class Paint {
    public static void main(String[] args) {
        Paint paint = new Paint();
        paint.pDraw(new Triangle());
        paint.pDraw(new Square());
    }

    public void pDraw(Shape shape) {
        System.out.println(shape.draw());
    }
}
