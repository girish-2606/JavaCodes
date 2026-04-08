package Collections;

import java.util.HashSet;
import java.util.Scanner;


public class HashSetOperations {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        // Create HashSet
        HashSet<Integer> employeeIDs = new HashSet<>();


        // Read initial number of IDs
        int n = sc.nextInt();


        // Add initial IDs
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            employeeIDs.add(id);
        }

        // Infinite loop for operations
        while (true) {


            String operation = sc.next();


            switch (operation) {


                case "ADD":
                    employeeIDs.add(sc.nextInt());
                    System.out.println(employeeIDs);
                    break;


                case "REMOVE":
                    employeeIDs.remove(sc.nextInt());
                    System.out.println(employeeIDs);
                    break;


                case "CHECK":
                    if (employeeIDs.contains(sc.nextInt())) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                    break;


                case "PRINT":
                    if (employeeIDs.isEmpty()) {
                        System.out.println("EMPTY");
                    } else {
                        System.out.println(employeeIDs);
                    }
                    break;


                case "STOP":
                    return; // stops the program


                default:
                    System.out.println("Invalid operation!");
            }
        }
    }
}
