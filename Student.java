class Student {
    String name;
    int age;
    public Student() {
        this.name = "Default Name";
        this.age = 18;
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
  public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    public static void main(String[] args) { 
        Student student1 = new Student();
        student1.display();
        Student student2 = new Student("John Doe", 20);
        student2.display();
    }
}