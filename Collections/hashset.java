package Collections;

import java.util.HashSet;
import java.util.Scanner;

public class hashset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            int num = sc.nextInt();
            set.add(num);
        }
        System.out.println(set);
        set.remove(175);
        System.out.println(set);
        boolean contains50 = set.contains(50);
        System.out.println("Contains 50: " + contains50);
    }
}
