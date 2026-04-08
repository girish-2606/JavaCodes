package Collections;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ArrayDeques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        for (int i = 0; i < n; i++) {
            deque.add(sc.nextInt());
        }
        int cutomerId = sc.nextInt();
        deque.addFirst(cutomerId);
        int lastCustomerId = sc.nextInt();
        deque.addLast(lastCustomerId);
        deque.removeFirst();
        deque.removeFirst();
        System.out.println("Updated ArrayDeque: ");
        for(Integer x: deque) {
            System.out.print(x+" ");
        }
        sc.close();
    }
}
