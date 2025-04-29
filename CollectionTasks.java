import java.util.*;

class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
    }
}

public class CollectionTasks {

    
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {

       
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(9);

        System.out.println("Prime number check:");
        for (int num : numbers) {  
            System.out.println(num + " is prime? " + isPrime(num));
        }

       
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 101, 50000));
        employees.add(new Employee("Bob", 102, 60000));
        employees.add(new Employee("Charlie", 103, 55000));

       
        for (Employee emp : employees) {
            if (emp.id == 102) {
                emp.salary = 65000;
            }
        }

        
        employees.removeIf(emp -> emp.id == 103);

        System.out.println("\nRemaining employees:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        
        HashMap<Integer, Integer> inventory = new HashMap<>();
        inventory.put(1, 100); // productId 1, quantity 100
        inventory.put(2, 50);
        inventory.put(3, 75);

       
        inventory.put(2, 60);

        
        inventory.remove(3);

        System.out.println("\nFinal inventory:");
        for (Map.Entry<Integer, Integer> entry : inventory.entrySet()) {
            System.out.println("Product ID: " + entry.getKey() + ", Quantity: " + entry.getValue());
        }

       
        String[] nameArray = {"Aman", "Varchasv", "Divyansh", "Varchasv", "Aman"};
        HashSet<String> nameSet = new HashSet<>(Arrays.asList(nameArray));

       
        String nameToCheck = "Varchasv";
        System.out.println("\nIs " + nameToCheck + " in the set? " + nameSet.contains(nameToCheck));

        System.out.println("Unique names:");
        for (String name : nameSet) {
            System.out.println(name);
        }

       
        ArrayList<Integer> numsWithDuplicates = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5));
        HashSet<Integer> uniqueNums = new HashSet<>(numsWithDuplicates);

        int sum = 0;
        for (int val : uniqueNums) {
            sum += val;
        }

        System.out.println("\nSum of unique values: " + sum);
    }
}
