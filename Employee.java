import java.util.Scanner;

 class Employee {
    
    private int employeeID;
    private String name;
    private String department;
    private double salary;

    
    static int totalEmployees = 0;

    
    public Employee() {
        this.employeeID = 0;
        this.name = "Default Name";
        this.department = "Default Department";
        this.salary = 0.0;
        totalEmployees++;
    }

    
    public Employee(int employeeID, String name, String department, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.salary = salary;
        totalEmployees++;
    }

    public Employee(int employeeID) {
        this.employeeID = employeeID;
    }

    
    public double calculateSalary() {
        return salary;
    }

   
    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }

    
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Employee emp1 = new Employee();
        Employee emp2 = new Employee(101, "Alice", "Engineering", 50000);
        Employee emp3 = new Employee(102, "Bob", "Marketing", 60000);

        
        displayTotalEmployees();

        
        System.out.println("\nEmployee 1 Info:");
        emp1.displayEmployeeInfo();

        System.out.println("\nEmployee 2 Info:");
        emp2.displayEmployeeInfo();

        System.out.println("\nEmployee 3 Info:");
        emp3.displayEmployeeInfo();

       
        System.out.println("\nSalary of Employee 1: " + emp1.calculateSalary());
        System.out.println("Salary of Employee 2: " + emp2.calculateSalary());
        System.out.println("Salary of Employee 3: " + emp3.calculateSalary());

        scanner.close();
    }
}
