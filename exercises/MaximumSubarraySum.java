import java.util.Scanner;

public class MaximumSubarraySum {
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

        int currentSum = numbers[0];
        int maximumSum = numbers[0];
        for (int index = 1; index < size; index++) {
            currentSum = Math.max(numbers[index], currentSum + numbers[index]);
            maximumSum = Math.max(maximumSum, currentSum);
        }

        System.out.println("Maximum subarray sum: " + maximumSum);
        scanner.close();
    }
}