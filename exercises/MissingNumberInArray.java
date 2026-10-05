import java.util.Scanner;

public class MissingNumberInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N for the range 1 to N: ");
        int range = scanner.nextInt();

        if (range < 1) {
            System.out.println("N must be positive.");
            scanner.close();
            return;
        }

        int[] numbers = new int[range - 1];
        System.out.println("Enter the " + (range - 1) + " numbers from 1 to " + range + " (one is missing):");
        long actualSum = 0;
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = scanner.nextInt();
            actualSum += numbers[index];
        }

        long expectedSum = (long) range * (range + 1) / 2;
        System.out.println("Missing number: " + (expectedSum - actualSum));
        scanner.close();
    }
}