import java.util.Scanner;

public class Division{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("ENTER THE NUMERATOR.");
            int NUMERATOR =scanner.nextInt();

            System.out.println("ENTER THE DENOMINATOR");
             int DENOMINATOR = scanner.nextInt();
             int result = NUMERATOR/DENOMINATOR;
             System.out.println("Result" + result);
            
        } catch (ArithmeticException e) {
            System.out.println("ERROR : cannot be Divisible by 0");
        }
        finally{
            System.out.println("OPERATION COMPLETED");
        }
        scanner.close();
    }

    
}

