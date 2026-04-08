package Comparators;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class DescendingSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }
        //sort the list using a custom comparator for descending order
        // numbers.sort((a, b) -> b.compareTo(a));
        // System.out.println("Elements in descending order:");
        // for (int num : numbers) {
        //     System.out.print(num + " ");
        // }
        // System.out.println();
        Comparator<Integer> descendingComparator = (a, b) -> b.compareTo(a);
        numbers.sort(descendingComparator);
        System.out.println("Elements in descending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        scanner.close();

    }
}
