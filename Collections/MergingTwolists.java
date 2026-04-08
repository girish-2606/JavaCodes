package Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class MergingTwolists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1 & 2. Read first list
        int n1 = sc.nextInt();
        ArrayList<String> list1 = new ArrayList<>();
        for (int i = 0; i < n1; i++) {
            list1.add(sc.next());
        }

        // 3 & 4. Read second list
        int n2 = sc.nextInt();
        ArrayList<String> list2 = new ArrayList<>();
        for (int i = 0; i < n2; i++) {
            list2.add(sc.next());
        }

        // 5. Merge both lists into a new ArrayList
        ArrayList<String> mergedList = new ArrayList<>(list1); // Start with list1
        mergedList.addAll(list2); // Add all elements from list2

        // 6. Print all three lists
        System.out.print("List of first array: ");
        printList(list1);

        System.out.print("List of second array: ");
        printList(list2);

        System.out.print("New array: ");
        printList(mergedList);

        sc.close();
    }

    // Helper method to print the list elements separated by spaces
    private static void printList(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + (i < list.size() - 1 ? " " : ""));
        }
        System.out.println();
    }
}