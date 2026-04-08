package Strings;

import java.util.Scanner;

public class charFrequency {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = s.next();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int count = 0;
            if(str.indexOf(ch) != i) {
                continue;
            }

            for(int j=0;j<str.length();j++){
                if(ch == str.charAt(j)){
                    count++;
                }
            }

            System.out.println(ch+": "+count);

        }
        s.close();
    }
}
