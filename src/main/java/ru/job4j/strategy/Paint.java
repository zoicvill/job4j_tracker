package ru.job4j.strategy;

public class Paint {
    public void pDraw(Shape shape){
        System.out.println(shape.draw());
    }

    public static void main(String[] args) {
        Paint paint = new Paint();
        paint.pDraw(new Triangle());
        paint.pDraw(new Square());
    }
}
