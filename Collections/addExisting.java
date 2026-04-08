package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class addExisting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int size = sc.nextInt();
        for(int i=0; i<size; i++) {
            list.add(sc.nextInt());
        }
        int insert = sc.nextInt();
        System.out.println("Updated ArrayList: ");
        list.add(0, insert);
        for(int in : list) {
            System.out.print(in+" ");
        }
        sc.close();
    }
}
