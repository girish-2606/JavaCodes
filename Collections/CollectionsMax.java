package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CollectionsMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        String str = sc.nextLine();
        for (String s : str.split(" ")) {
            list.add(Integer.parseInt(s));
        }
        int max = Collections.max(list);
        int min = Collections.min(list);
        System.out.println("Minimum element: " + min);  
        System.out.println("Maximum element: " + max);
        sc.close();
    }
}
