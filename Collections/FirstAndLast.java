package Collections;

import java.util.LinkedList;
import java.util.Scanner;

public class FirstAndLast {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }
        String findString = sc.next();
        if(list.contains(findString)) {
            System.out.println("First Occurrence of " + findString + ": " + list.indexOf(findString));
            System.out.println("Last Occurrence of " + findString + ": " + list.lastIndexOf(findString));
        } else {
            System.out.println(findString + " not found in the list.");
        }
        sc.close();

    }
}

