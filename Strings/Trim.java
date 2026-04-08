package Strings;

import java.util.Scanner;

public class Trim {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = s.nextLine();
        System.out.println(str.trim());
        s.close();
    }
}
