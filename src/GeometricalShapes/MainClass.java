package GeometricalShapes;

import java.util.Scanner;
import model.Circle;
import model.Rectangle;
import model.Triangle;

class MainClass {

    static Scanner sc = new Scanner(System.in);

    static boolean loop;
    static int calcChoice;
    static double base;
    static double height;
    static int menuChoice;
    static int again;

    public static void main(String[] args) {

        do {

            calcMenu();

            if (menuChoice == 4) {
                break;
            }

            switch (menuChoice) {
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
                    loop = true;
            }

            calcAgain();

        } while (loop);

    }

    public static void handleCircle() {
        System.out.println("\nCircle chosen.");
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
            loop = true;
        }
    }

    public static void handleRectangle() {
        System.out.println("\nRectangle chosen.");
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
            loop = true;
        }
    }

    public static void handleTriangle() {
        System.out.println("\nTriangle chosen.");
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
            loop = true;
        }
    }

    public static void calcMenu() {
        System.out.println("\nChoose a geometrical shape to calculate:\n1. Circle\n2. Rectangle\n3. Triangle\n4. Exit");
        System.out.print("\nChoice: ");
        menuChoice = sc.nextInt();
    }

    public static void calcAgain() {
        System.out.println("\nDo you want to calculate another object?\n1. Yes\n2. No");
        System.out.print("\nChoice: ");
        again = sc.nextInt();
        if (again == 1) {
            loop = true;
        } else {
            loop = false;
        }
    }
}
