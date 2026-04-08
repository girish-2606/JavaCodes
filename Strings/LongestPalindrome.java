package Strings;

import java.util.Scanner;

public class LongestPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        if (input == null || input.length() < 1) {
            System.out.println("");
        } else {
            String result = getLongestPalindrome(input);
            System.out.println("Longest Palindromic Substring: " + result);
        }
        sc.close();
    }

    public static String getLongestPalindrome(String s) {
        String longest = "";
        for (int i = 0; i < s.length(); i++) {
            // Case 1: Odd length (center is a single character, e.g., "aba")
            String odd = expand(s, i, i);
            if (odd.length() > longest.length()) {
                longest = odd;
            }

            // Case 2: Even length (center is between two characters, e.g., "abba")
            String even = expand(s, i, i + 1);
            if (even.length() > longest.length()) {
                longest = even;
            }
        }
        return longest;
    }

    private static String expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // Substring from left+1 to right (exclusive of right)
        return s.substring(left + 1, right);
    }
}