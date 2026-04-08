package HashSet;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDupli {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }
        System.out.println("Unique elements in the order of insertion:");
        for (int num : set) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
    