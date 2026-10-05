import java.util.Scanner;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the first sorted array: ");
        int firstSize = scanner.nextInt();
        System.out.print("Enter the size of the second sorted array: ");
        int secondSize = scanner.nextInt();

        if (firstSize < 0 || secondSize < 0) {
            System.out.println("Array sizes cannot be negative.");
            scanner.close();
            return;
        }

        int[] first = new int[firstSize];
        int[] second = new int[secondSize];
        System.out.println("Enter the " + firstSize + " sorted numbers for the first array:");
        for (int index = 0; index < firstSize; index++) {
            first[index] = scanner.nextInt();
        }
        System.out.println("Enter the " + secondSize + " sorted numbers for the second array:");
        for (int index = 0; index < secondSize; index++) {
            second[index] = scanner.nextInt();
        }

        int[] merged = new int[firstSize + secondSize];
        int firstIndex = 0;
        int secondIndex = 0;
        int mergedIndex = 0;
        while (firstIndex < firstSize && secondIndex < secondSize) {
            if (first[firstIndex] <= second[secondIndex]) {
                merged[mergedIndex++] = first[firstIndex++];
            } else {
                merged[mergedIndex++] = second[secondIndex++];
            }
        }
        while (firstIndex < firstSize) {
            merged[mergedIndex++] = first[firstIndex++];
        }
        while (secondIndex < secondSize) {
            merged[mergedIndex++] = second[secondIndex++];
        }

        System.out.print("Merged array: ");
        for (int number : merged) {
            System.out.print(number + " ");
        }
        System.out.println();
        scanner.close();
    }
}