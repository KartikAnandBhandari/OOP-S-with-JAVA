class Worker {
    String name;
    double salaryRate;

    public Worker(String name, double salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }

    public double computePay(int hours) {
        return hours * salaryRate;
    }
}

class DailyWorker extends Worker {
    public DailyWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    public double computePay(int days) {
        return super.computePay(days * 8);
    }
}

class SalariedWorker extends Worker {
    public SalariedWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    public double computePay(int hours) {
        return super.computePay(40); // Fixed weekly wage
    }
}

public class WorkerTest {
    public static void main(String[] args) {
        Worker daily = new DailyWorker("John", 100);
        Worker salaried = new SalariedWorker("Alice", 150);

        System.out.println("Daily Worker Pay: " + daily.computePay(5));
        System.out.println("Salaried Worker Pay: " + salaried.computePay(50));
    }
}