package Comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CollectionsSort {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of elements: ");
            int n = sc.nextInt();
            ArrayList<Integer> numbers = new ArrayList<>();
            System.out.println("Enter the elements:");
            for (int i = 0; i < n; i++) {
                numbers.add(sc.nextInt());
            }
            Collections.sort(numbers, Collections.reverseOrder());
            System.out.println("Elements in descending order:"+numbers);
        }
    }
}
