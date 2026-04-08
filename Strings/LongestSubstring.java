package Strings;

import java.util.Scanner;

public class LongestSubstring {
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        Scanner s = new Scanner(System.in);
        String str = s.next();
        char[] charArray = str.toCharArray();

        int len = str.length();

        for(int i=0; i<charArray.length; i++) {
            if(charArray[i] == charArray[len-1]) {
                len--;
            }
        }
        System.out.println(len);
        s.close();
    }
}
