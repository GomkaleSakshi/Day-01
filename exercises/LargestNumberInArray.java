import java.util.Scanner;

public class LargestNumberInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Array size must be positive.");
            scanner.close();
            return;
        }

        int[] numbers = new int[size];
        System.out.println("Enter " + size + " numbers:");
        for (int index = 0; index < size; index++) {
            numbers[index] = scanner.nextInt();
        }

        int largest = numbers[0];
        for (int index = 1; index < size; index++) {
            if (numbers[index] > largest) {
                largest = numbers[index];
            }
        }

        System.out.println("Largest number: " + largest);
        scanner.close();
    }
}