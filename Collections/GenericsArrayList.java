package Collections;

import java.util.*;

public class GenericsArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Read the number of elements
        if (!sc.hasNextInt()) 
            return;
        int n = sc.nextInt();
        
        // 2. Read the type of elements
        String type = sc.next();

        // 3. Handle the input based on type and Add to ArrayList
        if (type.equalsIgnoreCase("Integer")) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }
            displayList(list);
        } else if (type.equalsIgnoreCase("Double")) {
            ArrayList<Double> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(sc.nextDouble());
            }
            displayList(list);
        } else if (type.equalsIgnoreCase("String")) {
            ArrayList<String> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(sc.next());
            }
            displayList(list);
        }

        sc.close();
    }

    /**
     * Generic method to print the size and elements of any ArrayList.
     * This fulfills requirements 4 and 5.
     */
    public static <T> void displayList(ArrayList<T> list) {
        // 4. Print the size
        System.out.println("Size: " + list.size());

        // 5. Print all elements in order
        System.out.print("Elements: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + (i == list.size() - 1 ? "" : " "));
        }
        System.out.println();
    }
}