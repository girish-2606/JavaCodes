package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CollectionsSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> cities = new ArrayList<String>();
        System.out.println("Enter the number of cities: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline after nextInt
        System.out.println("Enter the names of the cities: ");
        for(int i=0; i<n; i++) {
            String city = sc.nextLine().trim();
            if (!city.isEmpty()) {
                cities.add(city);
            } else {
                i--; // retry this index if blank line read
            }
        }
        Collections.reverse(cities);
        System.out.println("Cities in reverse order: ");
        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i));
            if (i < cities.size() - 1) {
                System.out.print(", ");
            }
        }
        sc.close();
    }
}
