package Strings;

import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = s.nextLine().toLowerCase();
        System.out.println("Enter the character to be find: ");
        char ch = s.next().charAt(0);
        System.out.println("Enter the index of the char: ");
        int ind = s.nextInt();
        System.out.println(ch+" is found at index:"+str.indexOf(ch));
        if(ind >= 0 && ind <= str.length()){
            System.out.println("Character at "+ind+" is: "+str.charAt(ind));
        } else {
            System.out.println("Invalid index no's.");
        }
        System.out.println();
        s.close();
    }
}
