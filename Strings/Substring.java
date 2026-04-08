package Strings;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = s.nextLine();

        for(int i=0; i<str.length();i++) {
            String temp = "";

            for(int j=i; j<str.length(); j++) {
                temp += str.charAt(j);
                System.out.println(temp);
            }
        }
        s.close();
    }
}
    