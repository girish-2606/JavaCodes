package Collections;

import java.util.Scanner;
import java.util.TreeSet;

public class KthSmallest {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            TreeSet<Integer> set = new TreeSet<>();
            for (int i = 0; i < n; i++) {
                set.add(sc.nextInt());
            }
            int k = sc.nextInt();
            if (k > set.size()) {
                System.out.println("K is larger than the number of unique elements.");
            } else {
                int count = 0;
                for (Integer num : set) {
                    count++;
                    if (count == k) {
                        System.out.println("K-th smallest element: " + num);
                        break;
                    }
                }
            }
        }
    }
}
