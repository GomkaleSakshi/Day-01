import java.util.Scanner;

public class SearchElementInArray {
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
        System.out.print("Enter the number to search for: ");
        int target = scanner.nextInt();

        int foundIndex = -1;
        for (int index = 0; index < size; index++) {
            if (numbers[index] == target) {
                foundIndex = index;
                break;
            }
        }

        if (foundIndex >= 0) {
            System.out.println("Number found at index " + foundIndex + ".");
        } else {
            System.out.println("Number not found.");
        }
        scanner.close();
    }
}