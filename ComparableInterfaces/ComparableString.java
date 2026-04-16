package ComparableInterfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ComparableString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of strings: ");
            int n = sc.nextInt();
            ArrayList<MyString> strings = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                System.out.print("Enter string " + (i + 1) + ": ");
                String str = sc.next();
                strings.add(new MyString(str));
            }
            Collections.sort(strings, (s2,s1) -> s1.compareTo(s2)); // Sort in reverse order
            System.out.println("Strings sorted in reverse order:");
            for (MyString s : strings) {
                System.out.println(s.str);
            }
        }
    }
    
}

class MyString implements Comparable<MyString> {
    String str;

    public MyString(String str) {
        this.str = str;
    }

    @Override
    public int compareTo(MyString other) {
        return this.str.compareTo(other.str); // Sort by string value
    }
}