class University {
    static String universityName = "UPES";
    String studentName;
    public University(String name) {
        this.studentName = name;
    }
    public static void displayUniversityName() {
        System.out.println("University Name: " + universityName);
    }
    public static void main(String[] args) {
        
        University student1 = new University("Kartik");
        University student2 = new University("Ayushman");
       
        student1.displayUniversityName();
        System.out.println("Student 1 Name: " + student1.studentName);
        student2.displayUniversityName();
        System.out.println("Student 2 Name: " + student2.studentName);
        
        University.universityName = "UPES University";
        student1.displayUniversityName();
        student2.displayUniversityName();
    }
}
