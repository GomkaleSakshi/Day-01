import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        String reversed = "";

        for (int index = text.length() - 1; index >= 0; index--) {
            reversed += text.charAt(index);
        }

        System.out.println("Reversed string: " + reversed);
        scanner.close();
    }
}