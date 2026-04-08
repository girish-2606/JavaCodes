package Strings;

import java.util.Scanner;

public class Rotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Prompt for input string
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // 2. Prompt for rotation count
        System.out.println("Enter number of positions for rotation:");
        int n = scanner.nextInt();

        // 3. Prompt for direction
        System.out.println("Enter direction (left or right):");
        String direction = scanner.next().toLowerCase();

        String rotatedString = rotate(input, n, direction);
        
        System.out.println("Rotated String: " + rotatedString);
        
        scanner.close();
    }

    public static String rotate(String str, int n, String direction) {
        int length = str.length();
        if (length == 0) return str;

        // Handle cases where n > length
        n = n % length;

        if (direction.equals("left")) {
            // Take characters from index n to end + characters from 0 to n
            return str.substring(n) + str.substring(0, n);
        } else if (direction.equals("right")) {
            // Take characters from (length - n) to end + characters from 0 to (length - n)
            return str.substring(length - n) + str.substring(0, length - n);
        } else {
            return "Invalid direction!";
        }
    }
}