package HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class UnionHashSet {
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
        HashSet<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        System.out.println("Union of the two sets:");
        for (int num : unionSet) {
            System.out.print(num + " ");
        }
    }
}
