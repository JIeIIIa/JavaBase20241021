package com.gmail.onishchenko.homework.polymorphism;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Square(4),
                new Circle(1),
                new Triangle(new double[]{3, 4, 5}),
                new Square(1)

        };

        double totalArea = totalArea(shapes);
        System.out.println("Total area is " + totalArea);
    }

    private static double totalArea(Shape[] shapes) {
        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.area();
        }
        return sum;
    }

}
