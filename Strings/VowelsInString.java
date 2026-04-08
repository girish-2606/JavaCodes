package Strings;

import java.util.Scanner;

public class VowelsInString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = s.nextLine().toLowerCase();
        System.out.println("Original String: "+str);
        int count = 0;
        s.close();
        for(int i=0;i<str.length();i++) {
            char[] charArray = str.toCharArray();
            if(charArray[i] == 'a'||charArray[i] == 'e'||charArray[i] == 'i'||charArray[i] == 'o'|| charArray[i] == 'o') {
                count++;
            }

        }
        System.out.println("Number of vowels: "+count);
    }
}
