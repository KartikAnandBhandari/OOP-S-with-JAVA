import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderExample {
    static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = scanner.nextLine();
        try {
            readFile(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        } finally {
            System.out.println("File operation attempted.");
        }
        scanner.close();
    }
}
