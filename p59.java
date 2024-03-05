import java.util.Scanner;

abstract class Shape {
    protected double dimension1;
    protected double dimension2;

    // Abstract method to print the area
    abstract void printArea();
}

class Rectangle extends Shape {
    // Constructor to initialize dimensions for rectangle
    public Rectangle(double length, double width) {
        this.dimension1 = length;
        this.dimension2 = width;
    }

    // Implementation of abstract method to print area for rectangle
    void printArea() {
        double area = dimension1 * dimension2;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Triangle extends Shape {
    // Constructor to initialize dimensions for triangle
    public Triangle(double base, double height) {
        this.dimension1 = base;
        this.dimension2 = height;
    }

    // Implementation of abstract method to print area for triangle
    void printArea() {
        double area = 0.5 * dimension1 * dimension2;
        System.out.println("Area of Triangle: " + area);
    }
}

class Circle extends Shape {
    // Constructor to initialize dimension for circle
    public Circle(double radius) {
        this.dimension1 = radius;
    }

    // Implementation of abstract method to print area for circle
    void printArea() {
        double area = Math.PI * dimension1 * dimension1;
        System.out.println("Area of Circle: " + area);
    }
}

public class p59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage with concrete objects
        Rectangle rectangle = new Rectangle(5, 8);
        rectangle.printArea();

        Triangle triangle = new Triangle(4, 6);
        triangle.printArea();

        Circle circle = new Circle(3);
        circle.printArea();
    }
}
