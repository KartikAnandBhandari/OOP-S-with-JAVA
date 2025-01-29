public class commandlineexample  {
    public static void main(String args[]) {

        // Check if at least 3 arguments are provided
        if (args.length < 3) {
            System.out.println("Please provide two numbers and an operator as arguments.");
            return;
        }

        try {
           
            double num1 = Double.parseDouble(args[0]);  
            double num3 = Double.parseDouble(args[2]);

            
            String Symbol = args[1];

            
            double result = 0;
            boolean validOperation = true;

            if (Symbol.equals("+")) {
                result = num1 + num3;
            } else if (Symbol.equals("-")) {
                result = num1 - num3;
            } else if (Symbol.equals("*")) {
                result = num1 * num3;
            } else if (Symbol.equals("/")) {
                if (num3 != 0) {
                    result = num1 / num3;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperation = false;
                }
            } else {
                System.out.println("Error: Invalid operator. Use +, -, *, or /.");
                validOperation = false;
            }

            if (validOperation) {
                System.out.print("Inputs: ");
                System.out.print(num1 + " " + Symbol + " " + num3);
                System.out.println("\nResult: " + result);
                
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Please provide valid numeric arguments.");
        }
    }
}
