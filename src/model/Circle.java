package model;

public class Circle {

    private final double PI = 3.14;
    private double radius;

//  Constructor
    public Circle() {    
    }
    
//  Constructor that takes the radius argument  
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double area() {
        return radius * radius * PI;
    }

    public double circumference() {
        return PI * 2 * radius;
    }
}