package HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class differenceHashSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        HashSet<Integer> set1 = new HashSet<>();
        for (int i = 0; i < n1; i++) {
            set1.add(sc.nextInt());
        }
        int n2 = sc.nextInt();
        HashSet<Integer> set2 = new HashSet<>();
        for (int i = 0; i < n2; i++) {
            set2.add(sc.nextInt());
        }
        HashSet<Integer> differenceSet = new HashSet<>(set1);
        differenceSet.removeAll(set2);
        System.out.println("Difference of the two sets (set1 - set2):");
        for (int num : differenceSet) {
            System.out.print(num + " ");
        }
        sc.close();

    }
}
