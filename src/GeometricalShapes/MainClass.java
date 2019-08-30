package GeometricalShapes;

import java.util.Scanner;
import model.Circle;
import model.Rectangle;
import model.Triangle;

class MainClass {

    static Scanner sc = new Scanner(System.in);

    static boolean goAgain;
    static int calcChoice;
    static double base;
    static double height;

    public static void main(String[] args) {

        do {
            System.out.println("\nChoose a geometrical shape to calculate:\n1. Circle\n2. Rectangle\n3. Triangle\n4. Exit");
            System.out.print("\nChoice: ");
            int geometricalChoice = sc.nextInt();
            if (geometricalChoice == 4) {
                break;
            }

            switch (geometricalChoice) {
                case 1:
                    handleCircle();
                    break;
                case 2:
                    handleRectangle();
                    break;
                case 3:
                    handleTriangle();
                    break;
                default:
                    System.out.println("\nAnswer 1-4");
                    goAgain = true;
            }

            System.out.println("\nDo you want to calculate another object?\n1. Yes\n2. No");
            System.out.print("\nChoice: ");
            int again = sc.nextInt();
            if (again == 1) {
                goAgain = true;
            } else {
                goAgain = false;
            }

        } while (goAgain);

    }

    public static void handleCircle() {
        System.out.println("\nCircle choosen.");
        System.out.print("\nInput a radius: ");
        double radius = sc.nextDouble();

        Circle circle = new Circle(radius);

        System.out.println("\nWould you like to calculate area or circumference?\n1. Area\n2. Circumference");
        System.out.print("\nChoice: ");
        calcChoice = sc.nextInt();
        if (calcChoice == 1) {
            System.out.println("\nThe area is: " + circle.getArea());
        } else if (calcChoice == 2) {
            System.out.println("\nThe circumference is: " + circle.getCircumference());
        } else {
            goAgain = true;
        }
    }

    public static void handleRectangle() {
        System.out.println("\nRectangle choosen.");
        System.out.print("\nInput a base: ");
        base = sc.nextDouble();
        System.out.print("\nInput a heigth: ");
        height = sc.nextDouble();

        Rectangle rectangle = new Rectangle(base, height);

        System.out.println("\nWould you like to calculate area or circumference?\n1. Area\n2. Circumference");
        System.out.print("\nChoice: ");
        calcChoice = sc.nextInt();
        if (calcChoice == 1) {
            System.out.println("\nThe area is: " + rectangle.getArea());
        } else if (calcChoice == 2) {
            System.out.println("\nThe circumference is: " + rectangle.getCircumference());
        } else {
            goAgain = true;
        }
    }

    public static void handleTriangle() {
        System.out.println("\nTriangle choosen.");
        System.out.print("\nInput a base: ");
        base = sc.nextDouble();
        System.out.print("\nInput a heigth: ");
        height = sc.nextDouble();
        System.out.print("\nInput a side: ");
        double side1 = sc.nextDouble();
        System.out.print("\nInput another side: ");
        double side2 = sc.nextDouble();

        Triangle triangle = new Triangle(base, height, side1, side2);

        System.out.println("\nWould you like to calculate area or circumference?\n1. Area\n2. Circumference");
        System.out.print("\nChoice: ");
        calcChoice = sc.nextInt();
        if (calcChoice == 1) {
            System.out.println("\nThe area is: " + triangle.getArea());
        } else if (calcChoice == 2) {
            System.out.println("\nThe circumference is: " + triangle.getCircumference());
        } else {
            goAgain = true;
        }
    }
}
