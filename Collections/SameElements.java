package Collections;

import java.util.HashSet;
import java.util.Scanner;

public class SameElements {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int size1 = sc.nextInt();
            int size2 = sc.nextInt();
            HashSet<Integer> set1 = new HashSet<>();
            HashSet<Integer> set2 = new HashSet<>();
            for (int i = 0; i < size1; i++) {
                set1.add(sc.nextInt());
            }
            for (int i = 0; i < size2; i++) {
                set2.add(sc.nextInt());
            }
            set1.retainAll(set2); // Find common elements
            if(set1.equals(set2)) {
                System.out.println("NO");
            } else {
                System.out.println("YES");  
            }
        }

    }
}
