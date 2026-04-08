package Collections;

import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        for (int i = 0; i < n; i++) {
            pq.add(sc.nextInt());
        }
        int newElement = sc.nextInt();
        pq.add(newElement);
        int highestPriorityElement = pq.peek();
        pq.remove(highestPriorityElement);
        System.out.println("Updated Priority Queue: ");
        for(Integer x: pq) {
            System.out.print(x+" ");
        }
        sc.close();
    }   
}

