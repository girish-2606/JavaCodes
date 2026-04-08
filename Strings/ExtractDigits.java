package Strings;

import java.util.Scanner;

public class ExtractDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = s.nextLine();
        String digiString = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch >= '0' && ch <= '9') {
                digiString += ch;
            }
        }  
        System.out.println("Extracted Digits: "+digiString);   
        s.close();   
    }
}
