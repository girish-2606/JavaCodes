package Strings;
//import java.util.*;
import java.util.Scanner;

public class Capitalize {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = s.nextLine();
        String[] arr = str.split(" ");
        for(String s1 : arr)
            System.out.print(s1.substring(0,1).toUpperCase()+s1.substring(1,s1.length())+" ");
        s.close();
    }
}
