import java.lang.Math;

// Lớp cơ sở đại diện cho một hình học chung
class Shape {
    protected String color;
    protected String name;

    // Constructor
    public Shape(String color, String name) {
        this.color = color;
        this.name = name;
    }

    // Phương thức tính chu vi (abstract method)
    public double calculatePerimeter() {
        return 0;
    }

    // Phương thức tính diện tích (abstract method)
    public double calculateArea() {
        return 0;
    }
}

// Lớp con của lớp Shape đại diện cho các hình học hai chiều
class TwoDimensionalShape extends Shape {
    // Constructor
    public TwoDimensionalShape(String color, String name) {
        super(color, name);
    }
}

// Lớp con của lớp TwoDimensionalShape đại diện cho hình tròn
class Circle extends TwoDimensionalShape {
    private double radius;

    // Constructor
    public Circle(String color, String name, double radius) {
        super(color, name);
        this.radius = radius;
    }

    // Override phương thức tính chu vi của lớp Shape
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    // Override phương thức tính diện tích của lớp Shape
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Lớp con của lớp TwoDimensionalShape đại diện cho hình vuông
class Square extends TwoDimensionalShape {
    private double side;

    // Constructor
    public Square(String color, String name, double side) {
        super(color, name);
        this.side = side;
    }

    // Override phương thức tính chu vi của lớp Shape
    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    // Override phương thức tính diện tích của lớp Shape
    @Override
    public double calculateArea() {
        return side * side;
    }
}

// Lớp con của lớp TwoDimensionalShape đại diện cho hình tam giác
class Triangle extends TwoDimensionalShape {
    private double side1;
    private double side2;
    private double side3;

    // Constructor
    public Triangle(String color, String name, double side1, double side2, double side3) {
        super(color, name);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Override phương thức tính chu vi của lớp Shape
    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    // Override phương thức tính diện tích của lớp Shape
    @Override
    public double calculateArea() {
        // Sử dụng công thức Heron để tính diện tích tam giác
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}

// Lớp con của lớp Shape đại diện cho các hình học ba chiều
class ThreeDimensionalShape extends Shape {
    // Constructor
    public ThreeDimensionalShape(String color, String name) {
        super(color, name);
    }
}

// Lớp con của lớp ThreeDimensionalShape đại diện cho hình cầu
class Sphere extends ThreeDimensionalShape {
    private double radius;

    // Constructor
    public Sphere(String color, String name, double radius) {
        super(color, name);
        this.radius = radius;
    }

    // Override phương thức tính diện tích của lớp Shape
    @Override
    public double calculateArea() {
        return 4 * Math.PI * radius * radius;
    }

    // Override phương thức tính thể tích của lớp Shape
    @Override
    public double calculatePerimeter() {
        return (4/3) * Math.PI * radius * radius * radius;
    }
}

// Lớp con của lớp ThreeDimensionalShape đại diện cho hình lập phương
class Cube extends ThreeDimensionalShape {
    private double side;

    // Constructor
    public Cube(String color, String name, double side) {
        super(color, name);
        this.side = side;
    }

    // Override phương thức tính diện tích của lớp Shape
    @Override
    public double calculateArea() {
        return 6 * side * side;
    }

    // Override phương thức tính thể tích của lớp Shape
    @Override
    public double calculatePerimeter() {
        return side * side * side;
    }
}

// Lớp con của lớp ThreeDimensionalShape đại diện cho hình tứ diện đều
class Tetrahedron extends ThreeDimensionalShape {
    private double side;

    // Constructor
    public Tetrahedron(String color, String name, double side) {
        super(color, name);
        this.side = side;
    }

    // Override phương thức tính diện tích của lớp Shape
    @Override
    public double calculateArea() {
        return Math.sqrt(3) * side * side;
    }

    // Override phương thức tính thể tích của lớp Shape
    @Override
    public double calculatePerimeter() {
        return (side * side * side) / (6 * Math.sqrt(2));
    }
}

class Main {
    public static void main(String[] args) {
        // Khởi tạo đối tượng và tính chu vi, diện tích cho mỗi hình
        Circle circle = new Circle("đỏ", "tròn", 6);
        System.out.println("Chu vi hình tròn: " + circle.calculatePerimeter());
        System.out.println("diện tích hình tròn: " + circle.calculateArea());

        Square square = new Square("xanh dương", "vuông", 3);
        System.out.println("chu vi hình vuông: " + square.calculatePerimeter());
        System.out.println("diện tích hình vuông: " + square.calculateArea());

        Triangle triangle = new Triangle("xanh lá", "Tam giác", 2, 3, 5);
        System.out.println("chu vi tam giác: " + triangle.calculatePerimeter());
        System.out.println("diện tích tam giác: " + triangle.calculateArea());

        Sphere sphere = new Sphere("vàng", "hình cầu", 7);
        System.out.println("diện tích hình cầu: " + sphere.calculateArea());
        System.out.println("thể tích hình cầu: " + sphere.calculatePerimeter());

        Cube cube = new Cube("tím", "lập phương", 8);
        System.out.println("diện tích hình lập phương: " + cube.calculateArea());
        System.out.println("thê tích hình lập phương: " + cube.calculatePerimeter());

        Tetrahedron tetrahedron = new Tetrahedron("cam", "Tứ diện đều", 4);
        System.out.println("diện tích hình Tứ diện đều: " + tetrahedron.calculateArea());
        System.out.println("thể tích hình Tứ diện đều: " + tetrahedron.calculatePerimeter());
    }
}

