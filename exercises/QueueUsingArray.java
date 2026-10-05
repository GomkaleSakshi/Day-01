import java.util.Scanner;

public class QueueUsingArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the queue capacity: ");
        int capacity = scanner.nextInt();

        if (capacity <= 0) {
            System.out.println("Queue capacity must be positive.");
            scanner.close();
            return;
        }

        int[] queue = new int[capacity];
        int front = 0;
        int rear = -1;
        int count = 0;
        int choice;
        do {
            System.out.println("1. Enqueue  2. Dequeue  3. Display  0. Exit");
            System.out.print("Choose an operation: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                if (count == capacity) {
                    System.out.println("Queue is full.");
                } else {
                    System.out.print("Enter a number: ");
                    rear = (rear + 1) % capacity;
                    queue[rear] = scanner.nextInt();
                    count++;
                }
            } else if (choice == 2) {
                if (count == 0) {
                    System.out.println("Queue is empty.");
                } else {
                    System.out.println("Dequeued: " + queue[front]);
                    front = (front + 1) % capacity;
                    count--;
                }
            } else if (choice == 3) {
                if (count == 0) {
                    System.out.println("Queue is empty.");
                } else {
                    System.out.print("Queue (front to rear): ");
                    for (int index = 0; index < count; index++) {
                        System.out.print(queue[(front + index) % capacity] + " ");
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