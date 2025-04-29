import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class UniqueSum {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5));

        HashSet<Integer> uniqueNumbers = new HashSet<>(numbers);

        int sum = 0;
        for (int num : uniqueNumbers) {
            sum += num;
        }

        System.out.println("Sum of unique values: " + sum);
    }
}
