package HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class containsLinked {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(sc.next());
        }  
        String query = sc.next();
        if (set.contains(query)) {
            System.out.println(query + " is present in the HashSet.");
        } else {
            System.out.println(query + " is not present in the HashSet.");
        }
        sc.close();
    }
}
