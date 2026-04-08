package Strings;

import java.util.Scanner;

public class Ascii {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char ch = s.next().charAt(0);
        int value = (int) ch;
        System.out.println(value);
        s.close();
    }

}
