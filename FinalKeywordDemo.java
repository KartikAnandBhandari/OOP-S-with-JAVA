class MathConstants {
    final double PI = 3.14159;

    final void displayPI() {
        System.out.println("Value of PI: " + PI);
    }
}
class Circle extends MathConstants {
    void calculateArea(double radius) {
        double area = PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

   
}
public class FinalKeywordDemo {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.displayPI();
        c.calculateArea(5.0);

      
    }
}
