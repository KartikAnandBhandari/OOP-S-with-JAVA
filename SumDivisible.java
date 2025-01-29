public class SumDivisible{
    public static void main(String[] args) {
        int start = 36; 
        int end = 950;  
        int first = (start % 18 == 0) ? start : start + (18 - start % 18);

        int last = end - (end % 18);
        int n = (last - first) / 18 + 1;
        int sum = n * (first + last) / 2;
        System.out.println("The sum of integers between 10 and 950 divisible by both 6 and 9 is: " + sum);
    }
}
