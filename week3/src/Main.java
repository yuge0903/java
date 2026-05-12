import java.lang.Math;

class Shape {
    String color;
    String name;

    Shape(String color, String name) {
        this.color = color;
        this.name = name;
    }
}

class TwoDimensionalShape extends Shape {
    double width;
    double height;

    TwoDimensionalShape(String color, String name, double width, double height) {
        super(color, name);
        this.width = width;
        this.height = height;
    }

    double calculateArea() {
        return 0.0;
    }

    double calculatePerimeter() {
        return 0.0;
    }
}

class Circle extends TwoDimensionalShape {
    double radius;

    Circle(String color, String name, double radius) {
        super(color, name, radius * 2, radius * 2);
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Square extends TwoDimensionalShape {
    double sideLength;

    Square(String color, String name, double sideLength) {
        super(color, name, sideLength, sideLength);
        this.sideLength = sideLength;
    }

    double calculateArea() {
        return Math.pow(sideLength, 2);
    }

    double calculatePerimeter() {
        return 4 * sideLength;
    }
}

class Triangle extends TwoDimensionalShape {
    double side1;
    double side2;
    double side3;

    Triangle(String color, String name, double side1, double side2, double side3) {
        super(color, name, 0, 0);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

class ThreeDimensionalShape extends Shape {
    double length;
    double width;
    double height;

    ThreeDimensionalShape(String color, String name, double length, double width, double height) {
        super(color, name);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    double calculateVolume() {
        return 0.0;
    }

    double calculateSurfaceArea() {
        return 0.0;
    }
}

class Sphere extends ThreeDimensionalShape {
    double radius;

    Sphere(String color, String name, double radius) {
        super(color, name, radius * 2, radius * 2, radius * 2);
        this.radius = radius;
    }

    double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    double calculateSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}

class Cube extends ThreeDimensionalShape {
    double sideLength;

    Cube(String color, String name, double sideLength) {
        super(color, name, sideLength, sideLength, sideLength);
        this.sideLength = sideLength;
    }

    double calculateVolume() {
        return Math.pow(sideLength, 3);
    }

    double calculateSurfaceArea() {
        return 6 * Math.pow(sideLength, 2);
    }
}

class Tetrahedron extends ThreeDimensionalShape {
    double sideLength;

    Tetrahedron(String color, String name, double sideLength) {
        super(color, name, sideLength, sideLength, sideLength);
        this.sideLength = sideLength;
    }

    double calculateVolume() {
        return (Math.pow(sideLength, 3)) / (6 * Math.sqrt(2));
    }

    double calculateSurfaceArea() {
        return Math.sqrt(3) * Math.pow(sideLength, 2);
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("do", "hinh tron", 5);
        System.out.println("dien tich hinh tron: " + circle.calculateArea());
        System.out.println("chu vi hinh tron: " + circle.calculatePerimeter());

        Square square = new Square("xanh", "Square", 4);
        System.out.println("Square Area: " + square.calculateArea());
        System.out.println("Square Perimeter: " + square.calculatePerimeter());

        Triangle triangle = new Triangle("green", "Triangle", 3, 4, 5);
        System.out.println("Triangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());

        Sphere sphere = new Sphere("yellow", "Sphere", 5);
        System.out.println("Sphere Volume: " + sphere.calculateVolume());
        System.out.println("Sphere Surface Area: " + sphere.calculateSurfaceArea());

        Cube cube = new Cube("purple", "Cube", 4);
        System.out.println("Cube Volume: " + cube.calculateVolume());
        System.out.println("Cube Surface Area: " + cube.calculateSurfaceArea());

        Tetrahedron tetrahedron = new Tetrahedron("orange", "Tetrahedron", 5);
        System.out.println("Tetrahedron Volume: " + tetrahedron.calculateVolume());
        System.out.println("Tetrahedron Surface Area: " + tetrahedron.calculateSurfaceArea());
    }
}
