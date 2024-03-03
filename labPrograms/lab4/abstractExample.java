abstract class Shape {
    // Two integers representing dimensions
    int dimension1;
    int dimension2;

    // Constructor
    Shape(int dimension1, int dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

    // Abstract method to be implemented by subclasses
    abstract void printArea();
}

class Rectangle extends Shape {
    // Constructor
    Rectangle(int length, int width) {
        super(length, width);
    }

    // Implementation of printArea for Rectangle
    @Override
    void printArea() {
        int area = dimension1 * dimension2;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Triangle extends Shape {
    // Constructor
    Triangle(int base, int height) {
        super(base, height);
    }

    // Implementation of printArea for Triangle
    @Override
    public void printArea() {
        double area = 0.5 * dimension1 * dimension2;
        System.out.println("Area of Triangle: " + area);
    }
}

class Circle extends Shape {
    // Constructor
    Circle(int radius) {
        super(radius, 0); // Only one dimension needed for a circle
    }

    // Implementation of printArea for Circle
    @Override
    void printArea() {
        double area = Math.PI * dimension1 * dimension1;
        System.out.println("Area of Circle: " + area);
    }
}

class abstractExample {
    public static void main(String[] args) {
        // Creating objects of each shape
        System.out.println("Bharath C\t1BMM22CS068");
        Rectangle rectangle = new Rectangle(5, 10);
        Triangle triangle = new Triangle(8, 6);
        Circle circle = new Circle(4);

        // Printing areas
        rectangle.printArea();
        triangle.printArea();
        circle.printArea();
    }
}
