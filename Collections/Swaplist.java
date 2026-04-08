package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Swaplist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int size = Integer.parseInt(sc.nextLine());

        for(int i=0; i<size; i++) {
            list.add(sc.next());
        }

        System.out.println("Array List Before Swap: ");
        for(String str1 : list) {
            System.out.println(str1);
        }
        System.out.println("Array List After Swap: ");
        if(list.size() >= 3) {
            Collections.swap(list, 0, 2);
        } else {
            System.out.println("Swapping isn't possible.");
        }
        for(String str1 : list) {
            System.out.println(str1);
        }
    }
}
