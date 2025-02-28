class Employee {
    String name;
    int empid;
    double salary;

    public Employee() {
        this.name = "Unknown";
        this.empid = 0;
        this.salary = 0;
    }

    public Employee(String name, int empid, double salary) {
        this.name = name;
        this.empid = empid;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double percentage) {
        salary += salary * percentage / 100;
    }
}

class Manager extends Employee {
    String department;

    public Manager(String name, int empid, double salary, String department) {
        super(name, empid, salary);
        this.department = department;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Manager mgr = new Manager("Alice", 101, 50000, "HR");
        System.out.println("Before Increase: " + mgr.getSalary());
        mgr.increaseSalary(10);
        System.out.println("After Increase: " + mgr.getSalary());
    }
}