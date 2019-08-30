package model;

public class Rectangle {

    private double base;
    private double height;

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return base * height;
    }

    public double getCircumference() {
        return (2 * base) + (2 * height);
    }
}
