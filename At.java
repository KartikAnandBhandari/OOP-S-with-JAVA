public class At {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java TriangleArea <base> <height>");
            return;
        }
        
        double base = Double.parseDouble(args[0]);
        double height = Double.parseDouble(args[1]);

        double area = 0.5 * base * height;
        System.out.println("Area of the triangle: " + area);
    }
}
