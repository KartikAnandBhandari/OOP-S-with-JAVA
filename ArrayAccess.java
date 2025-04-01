import java.util.Scanner;

public class ArrayAccess {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter index (0-4): ");
            int index = scanner.nextInt();
            System.out.println("Element at index " + index + ": " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index!");
        } finally {
            System.out.println("Array access attempted.");
        }
        scanner.close();
    }
}
