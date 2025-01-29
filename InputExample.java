public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Reading input
    System.out.print("Enter your name: ");

    String name = scanner.nextLine(); // Reads a line of text

    System.out.print("Enter your Collage name: ");
    String word = scanner.next();
    // System.out.println("You Father name: " + word);

    System.out.print("Enter your age: ");
    int age = scanner.nextInt(); // Reads an integer

    // System.out.print("Enter your age: ");
    // int SapId = scanner.nextInt(); // Reads an integer
    System.out.print("Enter a boolean value (true/false): ");
    boolean flag = scanner.nextBoolean();

    System.out.println("You entered: " + flag);
    // Output
    // System.out.println("Name: " + name + ", Age: " + age);
    scanner.close();
}
