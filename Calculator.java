public class Calculator {

    
    public int add(int a, int b) {
        return a + b;
    }

    
    public double add(double a, double b) {
        return a + b;
    }

    
    public int add(int a, int b, int c) {
        return a + b + c ;
    }

    public static void main(String[] args) {
        
        Calculator calc = new Calculator();

        
        int sum1 = calc.add(5, 10);            
        double sum2 = calc.add(5.5, 10.3);        
        int sum3 = calc.add(1, 2, 3);            

       
        System.out.println("Sum of two integers (5 + 10): " + sum1);
        System.out.println("Sum of two doubles (5.5 + 10.3): " + sum2);
        System.out.println("Sum of three integers (1 + 2 + 3): " + sum3);
    }
}