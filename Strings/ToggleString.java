package Strings;
import java.util.Scanner;

public class ToggleString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = toggleString(input);
        System.out.println("Toggled string: " + result);

        scanner.close();
    }

    public static String toggleString(String str) {
        StringBuilder sb = new StringBuilder();

        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // Toggle the case
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else {
                // Keep spaces or special characters as they are
                sb.append(c);
            }
        }

        return sb.toString();
    }
}