package Strings;

import java.util.*;

public class RotationStr {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.next();
        String s2 = s.next();
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        System.out.println(ch1);
        System.out.println(ch2);
        if(Arrays.equals(ch1,ch2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        s.close();
    }
}

// import java.util.Arrays;

// public class SortStringExample {
//     public static void main(String[] args) {
//         String original = "edcba";
//         char[] chars = original.toCharArray();   // Convert to char array
//         Arrays.sort(chars);                      // Sort characters
//         String sorted = new String(chars);       // Rebuild string
//         System.out.println(sorted);              // Output: abcde
//     }
// }