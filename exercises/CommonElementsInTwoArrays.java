import java.util.Scanner;

public class CommonElementsInTwoArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the first array: ");
        int firstSize = scanner.nextInt();
        System.out.print("Enter the size of the second array: ");
        int secondSize = scanner.nextInt();

        if (firstSize < 0 || secondSize < 0) {
            System.out.println("Array sizes cannot be negative.");
            scanner.close();
            return;
        }

        int[] first = new int[firstSize];
        int[] second = new int[secondSize];
        System.out.println("Enter the " + firstSize + " numbers for the first array:");
        for (int index = 0; index < firstSize; index++) {
            first[index] = scanner.nextInt();
        }
        System.out.println("Enter the " + secondSize + " numbers for the second array:");
        for (int index = 0; index < secondSize; index++) {
            second[index] = scanner.nextInt();
        }

        System.out.print("Common elements: ");
        boolean found = false;
        for (int firstIndex = 0; firstIndex < firstSize; firstIndex++) {
            boolean alreadyPrinted = false;
            for (int earlier = 0; earlier < firstIndex; earlier++) {
                if (first[earlier] == first[firstIndex]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (!alreadyPrinted) {
                for (int secondIndex = 0; secondIndex < secondSize; secondIndex++) {
                    if (first[firstIndex] == second[secondIndex]) {
                        System.out.print(first[firstIndex] + " ");
                        found = true;
                        break;
                    }
                }
            }
        }
        if (!found) {
            System.out.print("none");
        }
        System.out.println();
        scanner.close();
    }
}