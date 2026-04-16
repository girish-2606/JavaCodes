package Comparators;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class StringSort {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of strings: ");
            int n = sc.nextInt();
            sc.nextLine(); // Consume the newline character
            ArrayList<String> strings = new ArrayList<>();
            System.out.println("Enter the strings:");
            for (int i = 0; i < n; i++) {
                strings.add(sc.nextLine());
            }
            // Sort the list using a custom comparator for descending order
            Comparator<String> stringComparator = new StringComparator();
            strings.sort(stringComparator);
            System.out.println("Strings in descending order:");
            for (String str : strings) {
                System.out.println(str);
            }
        }

    }
}

class StringComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return s2.compareTo(s1);
    }
}
