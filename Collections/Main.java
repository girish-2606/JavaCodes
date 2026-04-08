package Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) return;
        
        int n = scanner.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        // Read n initial tasks
        for (int i = 0; i < n; i++) {
            pq.add(scanner.nextInt());
        }
        
        // Read the new task's priority and add to the queue
        if (scanner.hasNextInt()) {
            int newTaskPriority = scanner.nextInt();
            pq.add(newTaskPriority);
        }
        
        // Remove the highest-priority task
        pq.poll();
        
        // Print the updated queue 
        System.out.println("Updated Queue of Task Priorities:");
        boolean first = true;
        while (!pq.isEmpty()) {
            if (!first) {
                System.out.print(" ");
            }
            System.out.print(pq.poll());
            first = false;
        }
        System.out.println();
        
        scanner.close();
    }
}
