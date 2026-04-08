package Strings;

import java.util.Scanner;

public class replace {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = s.next();
        String str2 = s.next();
        String str3 = s.next();

        //char[] vowels = str1.toCharArray();

        for(int i=0; i<str1.length(); i++) {
            char ch = str1.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                str1 = str1.replace(ch, '%');
            }
        }
        System.out.print(str1);

        for(int i=0; i<str2.length(); i++) {
            char ch = str2.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                continue;
            }
            str2 = str2.replace(ch, '#');
        }
        System.out.print(str2);
        s.close();
        str3 = str3.toUpperCase();
        System.out.print(str3);

    }
}
