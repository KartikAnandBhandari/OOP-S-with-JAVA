 public class University {
    // Static variable for university name
    static String universityName = "UPES";
    
    // Non-static variable for student name
    String studentName;

    // Constructor to initialize student name
    public University(String name) {
        this.studentName = name;
    }

    // Static method to display the university name
    public static void displayUniversityName() {
        System.out.println("University Name: " + universityName);
    }
    
    public static void main(String[] args) {
        // Create student objects
        University student1 = new University("Kartik");
        University student2 = new University("Ayushman");

        // Demonstrating how static variable is shared and non-static is unique
        student1.displayUniversityName();
        System.out.println("Student 1 Name: " + student1.studentName);

        student2.displayUniversityName();
        System.out.println("Student 2 Name: " + student2.studentName);

        // Modifying static variable
        University.universityName = "UPES University";

        student1.displayUniversityName();
        student2.displayUniversityName();
    }
}
