package Collections;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class linkedHashset {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            LinkedHashSet<Integer> set = new LinkedHashSet<>();
            int size = sc.nextInt();
            sc.nextLine(); // consume the newline
            for (int i = 0; i < size; i++) { 
                //Maintain insertion order and no duplicates
                int element = sc.nextInt();
                set.add(element);
            }
            System.out.println(set);
        }

    }
}
