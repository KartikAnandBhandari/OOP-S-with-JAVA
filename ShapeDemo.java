abstract class Shape {
    abstract void calculateArea();
}

class Rectangle extends Shape {
    private double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void calculateArea() {
        double area = length * width;
        System.out.println("Rectangle Area: " + area);
    }
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Circle Area: " + area);
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape rect = new Rectangle(5, 10);
        rect.calculateArea();

        Shape circ = new Circle(7);
        circ.calculateArea();
    }
}
