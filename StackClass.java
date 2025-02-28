import java.util.Scanner;

interface StackInterface {
    void push(int item);
    int pop();
    void display();
}

class StackClass implements StackInterface {
    private int[] stack;
    private int top;
    private int capacity;

    StackClass(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1;
    }

    @Override
    public void push(int item) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow! Cannot push.");
        } else {
            stack[++top] = item;
            System.out.println("Pushed: " + item);
        }
    }

    @Override
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! Cannot pop.");
            return -1;
        } else {
            return stack[top--];
        }
    }

    @Override
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StackClass stack = new StackClass(5);

        while (true) {
            System.out.println("\nStack Operations:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    int item = scanner.nextInt();
                    stack.push(item);
                    break;
                case 2:
                    int popped = stack.pop();
                    if (popped != -1) System.out.println("Popped: " + popped);
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
