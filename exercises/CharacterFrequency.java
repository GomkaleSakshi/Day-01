import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        Map<Character, Integer> frequency = new LinkedHashMap<>();

        for (int index = 0; index < text.length(); index++) {
            char character = text.charAt(index);
            frequency.put(character, frequency.getOrDefault(character, 0) + 1);
        }

        System.out.println("Character frequencies:");
        for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
            System.out.println("'" + entry.getKey() + "': " + entry.getValue());
        }
        scanner.close();
    }
}