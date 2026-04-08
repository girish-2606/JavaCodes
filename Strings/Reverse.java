package Strings;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = s.nextLine();
        s.close();
        char[] charArray = str.toCharArray();
        char[] revArray = new char[str.length()];
        int j = charArray.length-1;

        for(int i=0;i<charArray.length;i++){
            revArray[j] = charArray[i];
            j--;
        }

        String revStr = new String(revArray);
        System.out.println(revStr);

    }
}
