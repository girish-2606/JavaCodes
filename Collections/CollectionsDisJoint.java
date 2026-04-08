package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CollectionsDisJoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        Collections.addAll(list1, str1.split(" "));
        Collections.addAll(list2, str2.split(" "));
        boolean isDisjoint = Collections.disjoint(list1, list2);
        System.out.println(isDisjoint);
    }
}
