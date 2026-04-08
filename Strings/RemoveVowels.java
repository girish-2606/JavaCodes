package Strings;

import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u') {
                str = str.replace(ch,' ');
            }
        }
        System.out.println(str.replaceAll("\\s+", ""));
        s.close();
    }
}
