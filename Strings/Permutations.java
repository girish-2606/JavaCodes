package Strings;

import java.util.Scanner;

public class Permutations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        //System.out.println("Permutations:");
        generatePermutations("", input);
        
        scanner.close();
    }

    public static void generatePermutations(String prefix, String remaining) {
        int n = remaining.length();
        
        // Base case: if no characters are left, we've formed a full permutation
        if (n == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                // Pick the character at index i
                char currentChar = remaining.charAt(i);
                
                // Form a new "remaining" string excluding the current character
                String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
                
                // Recurse with the character added to the prefix
                generatePermutations(prefix + currentChar, newRemaining);
            }
        }
    }
}