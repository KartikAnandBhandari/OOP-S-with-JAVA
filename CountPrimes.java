public class CountPrimes {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 2; i <= 1000; i++) {
            if (isPrime(i)) {
                count++;
            }
        }

        System.out.println("Total prime numbers between 1 and 1000: " + count);
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
