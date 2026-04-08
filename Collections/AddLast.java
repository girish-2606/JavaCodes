package Collections;

import java.util.LinkedList;
import java.util.Scanner;

public class AddLast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. Create a LinkedList to store customer names
        LinkedList<String> customers = new LinkedList<>();
        
        // 2. Read the number of customers (n)
        // Note: Using Integer.parseInt(nextLine) avoids issues with trailing newlines
        int n = Integer.parseInt(scanner.nextLine());
        
        // 3. Read n customer names and add them using addLast()
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            customers.addLast(name);
        }
        
        // 4. Print the size and all customer names
        System.out.println("Queue Size: " + customers.size());
        System.out.println("Customers:");
        
        for (String customer : customers) {
            System.out.println(customer);
        }
        
        scanner.close();
    }
}
