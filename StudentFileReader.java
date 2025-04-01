import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentFileReader {
    public static void main(String[] args) {
        File file = new File("student.txt");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        } finally {
            System.out.println("File operation attempted.");
        }
    }
}
