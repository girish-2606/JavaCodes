package Collections;

import java.util.PriorityQueue;
import java.util.Scanner;

public class firstElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements to be added to the array:");
        int n = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            pq.add(sc.nextInt());
        }
        int addElement = sc.nextInt();
        pq.add(addElement);
        System.out.println("First element in the priority queue: " + pq.peek());
        sc.close();
    }
}
