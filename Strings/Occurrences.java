package Strings;

import java.util.Scanner;

public class Occurrences {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine().toLowerCase();
        char ch = s.next().charAt(0);
        int count = 0;
        s.close();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(ch == c) {
                count++;
            }
        }
        System.out.println(count);
    }
}