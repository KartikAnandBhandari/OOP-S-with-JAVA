import java.util.ArrayList;

public class PrimeCheck {
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
        for (int num : numbers) { // Unboxing occurs here
            System.out.println(num + " is prime? " + isPrime(num));
        }
    }
}
