import java.util.Scanner;

abstract class TrunkCall {
    int duration;

    abstract double calculateCharge();
}

class Ordinary extends TrunkCall {
    public Ordinary(int duration) {
        this.duration = duration;
    }

    double calculateCharge() {
        return duration * 2.0;
    }
}

class Urgent extends TrunkCall {
    public Urgent(int duration) {
        this.duration = duration;
    }

    double calculateCharge() {
        return duration * 3.5;
    }
}

class Lightning extends TrunkCall {
    public Lightning(int duration) {
        this.duration = duration;
    }

    double calculateCharge() {
        return duration * 5.0;
    }
}

public class TrunkCallTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter duration in minutes: ");
        int duration = sc.nextInt();
        System.out.println("Enter type (1-Ordinary, 2-Urgent, 3-Lightning): ");
        int type = sc.nextInt();
        sc.close();

        TrunkCall call;
        if (type == 1) {
            call = new Ordinary(duration);
        } else if (type == 2) {
            call = new Urgent(duration);
        } else {
            call = new Lightning(duration);
        }

        System.out.println("Total charge: " + call.calculateCharge());
    }
}