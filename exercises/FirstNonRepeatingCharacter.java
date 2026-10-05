import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        Map<Character, Integer> frequency = new LinkedHashMap<>();

        for (int index = 0; index < text.length(); index++) {
            char character = text.charAt(index);
            frequency.put(character, frequency.getOrDefault(character, 0) + 1);
        }

        boolean found = false;
        for (int index = 0; index < text.length(); index++) {
            char character = text.charAt(index);
            if (frequency.get(character) == 1) {
                System.out.println("First non-repeating character: " + character);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("There is no non-repeating character.");
        }
        scanner.close();
    }
}