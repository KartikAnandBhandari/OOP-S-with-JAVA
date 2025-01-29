public class PatternPrinter {
    public static void main(String[] args) {
        int[] rowLengths = {1, 3, 5, 7, 9};
        for (int i = 0; i < rowLengths.length; i++) {
            for (int j = 0; j < rowLengths[i]; j++) {
                if (i % 2 == 0) {
                    System.out.print("? ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println(); 
        }
    }
}