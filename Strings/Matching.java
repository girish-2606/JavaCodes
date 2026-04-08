package Strings;

import java.util.Scanner;

public class Matching {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = s.nextLine();
        

        System.out.println(str.startsWith("Hello"));
        System.out.println(str.endsWith("World"));

        String regexString = "[a-zA-z]+";
        System.out.println(str.matches(regexString));
        s.close();
    }
}
