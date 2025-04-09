import java.util.Scanner;

public class Division{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER THE NUMERATOR.");
        int NUMERATOR =scanner.nextInt();

        System.out.println("ENTER THE DENOMINATOR");
        double DENOMINATOR = scanner.nextInt();
        try {

             double result = NUMERATOR/DENOMINATOR;
            double result2= NUMERATOR%DENOMINATOR;
             System.out.println("Result" + result);
             System.out.println("Result 2 :" + result2);
            
        } catch (ArithmeticException e) {
            System.out.println("ERROR : cannot be Divisible by 0");
        }
        finally{
            System.out.println("OPERATION COMPLETED");
        }
        scanner.close();
    }

    
}

