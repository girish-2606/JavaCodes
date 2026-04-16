package Collections;

import java.util.LinkedList;
import java.util.Scanner;   

public class Identical {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            LinkedList<String> list1 = new LinkedList<>();
            LinkedList<String> list2 = new LinkedList<>();
            int n = sc.nextInt();
            sc.nextLine(); // Consume the newline character
            for (int i = 0; i < n; i++) {
                list1.add(sc.next());
            }
            int n1 = sc.nextInt();
            sc.nextLine(); // Consume the newline character
            for (int i = 0; i < n1; i++) {
                list2.add(sc.next());
            }
            if(n1 == n && list1.containsAll(list2)) {
                System.out.println("The two lists are identical.");
            } else {
                System.out.println("The two lists are not identical.");
            }
        }
    }
}