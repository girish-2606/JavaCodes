package Collections;

import java.util.Scanner;
import java.util.TreeSet;

public class RemovingDuplicates {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            TreeSet<Integer> set = new TreeSet<>();
            for (int i = 0; i < n; i++) {
                set.add(sc.nextInt());
            }
            if(set.isEmpty()) {
                System.out.println("No unique numbers");
            } else {
                for (Integer num : set) {
                    System.out.print(num + " ");
                }
            }
        }
    }
}
