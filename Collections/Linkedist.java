package Collections;

import java.util.LinkedList;
import java.util.Scanner;

public class Linkedist {

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0; i<=n; i++) {
            ll.addLast(sc.nextLine());
        }

        System.out.println("Number of tasks: "+n);
        System.out.println("Tasks: ");
        for(Object x:ll) {
            System.out.println(x+" ");
        }
        sc.close();
    }
}