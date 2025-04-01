import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentFileWriter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Roll Number: ");
        String rollNumber = scanner.nextLine();
        System.out.print("Enter Grade: ");
        String grade = scanner.nextLine();

        try (FileWriter writer = new FileWriter("student.txt", true)) {
            writer.write("Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + grade + "\n");
            System.out.println("Student information saved successfully.");
        } catch (IOException e) {
            System.out.println("Error: Unable to write to file.");
        } finally {
            System.out.println("File operation attempted.");
        }
        scanner.close();
    }
}
