package HashSet;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class CommonLinkedHash {
    public static void main(String[] args) {
        System.out.println("This is a common class for LinkedHashSet examples.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements for the first set:");
        int n1 = sc.nextInt();
        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        System.out.println("Enter the elements for the first set:");
        for (int i = 0; i < n1; i++) {
            set1.add(sc.next());
        }
        sc.nextLine(); // Consume the newline character
        System.out.println("Enter the number of elements for the second set:");
        int n2 = sc.nextInt();
        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        System.out.println("Enter the elements for the second set:");
        for (int i = 0; i < n2; i++) {
            set2.add(sc.next());
        }
        LinkedHashSet<String> commonSet = new LinkedHashSet<>(set1);
        commonSet.retainAll(set2);
        System.out.println("Common elements in both sets:");
        for (String element : commonSet) {
            System.out.print(element + " ");
        }
        sc.close();
    }
}
