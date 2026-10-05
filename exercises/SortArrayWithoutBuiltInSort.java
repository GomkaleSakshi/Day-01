import java.util.Scanner;

public class SortArrayWithoutBuiltInSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int size = scanner.nextInt();

        if (size < 0) {
            System.out.println("Array size cannot be negative.");
            scanner.close();
            return;
        }

        int[] numbers = new int[size];
        System.out.println("Enter " + size + " numbers:");
        for (int index = 0; index < size; index++) {
            numbers[index] = scanner.nextInt();
        }

        for (int end = size - 1; end > 0; end--) {
            for (int index = 0; index < end; index++) {
                if (numbers[index] > numbers[index + 1]) {
                    int temporary = numbers[index];
                    numbers[index] = numbers[index + 1];
                    numbers[index + 1] = temporary;
                }
            }
        }

        System.out.print("Sorted array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        scanner.close();
    }
}