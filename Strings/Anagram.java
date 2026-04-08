package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String 1: ");
        String str1 = s.nextLine();
        System.out.println("Enter the String 2: ");
        String str2 = s.nextLine();
        s.close();
        if(str1.length() == str2.length()) {
            char arr1[] = str1.toCharArray();
            char arr2[] = str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if(Arrays.equals(arr1, arr2)) {
                System.out.println("The 2 strings are anagrams.");
            }
            
            
        } else {
            System.out.println("The 2 strings are not an anagarams.");
        }
    }
}
