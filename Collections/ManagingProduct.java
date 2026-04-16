package Collections;

import java.util.Scanner;
import java.util.TreeSet;

public class ManagingProduct {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n1 = sc.nextInt();
            TreeSet<String> electronicSet = new TreeSet<>();
            for (int i = 0; i < n1; i++) {
                electronicSet.add(sc.next());
            }
            int n2 = sc.nextInt();
            TreeSet<String> homeappliancesSet = new TreeSet<>();
            for (int i = 0; i < n2; i++) {
                homeappliancesSet.add(sc.next());
            }
            // Print merged products in sorted order
            TreeSet<String> unionSet = new TreeSet<>(electronicSet);
            unionSet.addAll(homeappliancesSet);
            System.out.println(String.join(" ", unionSet));

            // Print intersection (common products)
            TreeSet<String> intersectionSet = new TreeSet<>(electronicSet);
            intersectionSet.retainAll(homeappliancesSet);
            System.out.println(intersectionSet.isEmpty() ? "NO PRODUCTS" : String.join(" ", intersectionSet));

            // Print difference (electronic products only)
            TreeSet<String> differenceSet = new TreeSet<>(electronicSet);
            differenceSet.removeAll(homeappliancesSet);
            System.out.println(differenceSet.isEmpty() ? "NO PRODUCTS" : String.join(" ", differenceSet));
        }
    }
}

