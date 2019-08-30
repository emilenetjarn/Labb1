package GeometricalShapes;

import model.Circle;

class MainClass {

    public static void main(String[] args) {

        Circle myCircle = new Circle(5.4);

        System.out.println("Circle with radius " + myCircle.getRadius()
                + "\nhas the area " + myCircle.area()
                + "\nand the circumference " + myCircle.circumference());

    }
}