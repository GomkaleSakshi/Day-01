import java.util.Scanner;

public class StackUsingArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the stack capacity: ");
        int capacity = scanner.nextInt();

        if (capacity <= 0) {
            System.out.println("Stack capacity must be positive.");
            scanner.close();
            return;
        }

        int[] stack = new int[capacity];
        int top = -1;
        int choice;
        do {
            System.out.println("1. Push  2. Pop  3. Display  0. Exit");
            System.out.print("Choose an operation: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                if (top == capacity - 1) {
                    System.out.println("Stack is full.");
                } else {
                    System.out.print("Enter a number: ");
                    stack[++top] = scanner.nextInt();
                }
            } else if (choice == 2) {
                if (top == -1) {
                    System.out.println("Stack is empty.");
                } else {
                    System.out.println("Popped: " + stack[top--]);
                }
            } else if (choice == 3) {
                if (top == -1) {
                    System.out.println("Stack is empty.");
                } else {
                    System.out.print("Stack (top to bottom): ");
                    for (int index = top; index >= 0; index--) {
                        System.out.print(stack[index] + " ");
                    }
                    System.out.println();
                }
            } else if (choice != 0) {
                System.out.println("Invalid choice.");
            }
        } while (choice != 0);

        scanner.close();
    }
}