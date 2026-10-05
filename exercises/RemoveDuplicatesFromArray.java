import java.util.Scanner;

public class RemoveDuplicatesFromArray {
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

        int uniqueCount = 0;
        int[] uniqueNumbers = new int[size];
        for (int number : numbers) {
            boolean alreadyExists = false;
            for (int index = 0; index < uniqueCount; index++) {
                if (uniqueNumbers[index] == number) {
                    alreadyExists = true;
                    break;
                }
            }
            if (!alreadyExists) {
                uniqueNumbers[uniqueCount] = number;
                uniqueCount++;
            }
        }

        System.out.print("Array without duplicates: ");
        for (int index = 0; index < uniqueCount; index++) {
            System.out.print(uniqueNumbers[index] + " ");
        }
        System.out.println();
        scanner.close();
    }
}