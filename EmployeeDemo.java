 abstract class Employee {
    String name;
    String role;

    Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    abstract void calculateSalary();
    abstract void displayDetails();
}

class Manager extends Employee {
    private double salary;

    Manager(String name, double salary) {
        super(name, "Manager");
        this.salary = salary;
    }

    @Override
    void calculateSalary() {
        System.out.println("Manager's Salary: " + salary);
    }

    @Override
    void displayDetails() {
        System.out.println("Name: " + name + ", Role: " + role + ", Salary: " + salary);
    }
}

class Developer extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    Developer(String name, double hourlyRate, int hoursWorked) {
        super(name, "Developer");
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    void calculateSalary() {
        double salary = hourlyRate * hoursWorked;
        System.out.println("Developer's Salary: " + salary);
    }

    @Override
    void displayDetails() {
        System.out.println("Name: " + name + ", Role: " + role + ", Hourly Rate: " + hourlyRate + ", Hours Worked: " + hoursWorked);
    }
}

public class EmployeeDemo {  // File must be named EmployeeDemo.java
    public static void main(String[] args) {
        Employee manager = new Manager("Alice", 50000);
        manager.displayDetails();
        manager.calculateSalary();

        Employee developer = new Developer("Bob", 50, 160);
        developer.displayDetails();
        developer.calculateSalary();
    }
}
