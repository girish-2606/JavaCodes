package Collections;

import java.util.PriorityQueue;
import java.util.Scanner;

public class MaximumPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>((a, b) -> b - a);
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of elements to be added to the maximum priority queue:");
            int n = sc.nextInt();
            System.out.println("Enter the elements:");
            for (int i = 0; i < n; i++) {
                maxPQ.add(sc.nextInt());
            }
            int maxElement = sc.nextInt();
            maxPQ.add(maxElement);
        }
        maxPQ.poll(); // Remove the specified element
        System.out.println("Elements in the maximum priority queue:");
        while (!maxPQ.isEmpty()) {
            System.out.print(maxPQ.poll() + " ");
        }
    }
}
