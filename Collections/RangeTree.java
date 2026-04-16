package Collections;

import java.util.Scanner;
import java.util.TreeSet;

public class RangeTree {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            TreeSet<Integer> treeSet = new TreeSet<>();
            for (int i = 0; i < n; i++) {
                treeSet.add(sc.nextInt());
            }
            int minIndex = sc.nextInt();
            int maxIndex = sc.nextInt();
            // Get the range of elements from minIndex to maxIndex (inclusive)
            if(treeSet.subSet(minIndex, true, maxIndex, true).isEmpty()) {
                System.out.println("NO ELEMENTS IN RANGE");
            } else {
                for (int num : treeSet.subSet(minIndex, true, maxIndex, true)) {
                    System.out.print(num + " ");
                }
            }
        }
    }
}
