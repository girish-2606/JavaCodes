package Collections;

import java.util.Scanner;
import java.util.TreeSet;

public class treeSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of operations
        int n = sc.nextInt();
        sc.nextLine();  // consume the newline
        
        // TreeSet to store languages (automatically sorted, no duplicates)
        TreeSet<String> set = new TreeSet<>();
        
        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            String[] parts = input.split(" ");
            String operation = parts[0];
            
            switch (operation) {
                case "ADD":
                    set.add(parts[1]);
                    break;
                    
                case "REMOVE":
                    set.remove(parts[1]);
                    break;
                    
                case "CHECK":
                    if (set.contains(parts[1])) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                    break;
                    
                case "FIRST":
                    if (set.isEmpty()) {
                        System.out.println("NO LANGUAGES");
                    } else {
                        System.out.println(set.first());
                    }
                    break;
                    
                case "LAST":
                    if (set.isEmpty()) {
                        System.out.println("NO LANGUAGES");
                    } else {
                        System.out.println(set.last());
                    }
                    break;
                    
                case "PRINT":
                    if (set.isEmpty()) {
                        System.out.println("NO LANGUAGES");
                    } else {
                        for (String lang : set) {
                            System.out.print(lang + " ");
                        }
                        System.out.println();
                    }
                    break;
            }
        }
        
        sc.close();
    }
}