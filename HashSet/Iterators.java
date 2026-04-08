package HashSet;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Iterator;

public class Iterators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedHashSet<String> set = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(sc.next());
        }
        System.out.println("Elements in the LinkedHashSet:");
        for (String element : set) {
            System.out.println(element);
        }
        // using iterator
        System.out.println("Elements using Iterator:");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        sc.close();

    }
}
