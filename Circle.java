package Homework_8;

import static java.lang.Math.PI;

public class Circle extends Shape{
    double radius = 1;

    public Circle() {
    }

    Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    double getArea(double radius){
        return PI * Math.pow(radius,2);
    }

    double getPerimeter(double radius){
        return 2 * PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[" + super.toString() +
                ", radius=" + radius +
                ']';
    }
}
