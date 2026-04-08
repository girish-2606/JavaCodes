package Collections;

import java.util.Scanner;
import java.util.TreeSet;

public class MergeTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        TreeSet<Integer> set1 = new TreeSet<>();
        for (int i = 0; i < n1; i++) {
            set1.add(sc.nextInt());
        }
        int n2 = sc.nextInt();
        TreeSet<Integer> set2 = new TreeSet<>();
        for (int i = 0; i < n2; i++) {
            set2.add(sc.nextInt());
        }
        set1.addAll(set2);
        System.out.println("Merged TreeSet: " + set1);
        sc.close();
    }
}
