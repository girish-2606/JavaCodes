package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CollectionFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the names in single input: ");
        String input = sc.nextLine();
        ArrayList<String> names = new ArrayList<String>();
        Collections.addAll(names, input.split("\\s+"));
        System.out.println("Enter the name to find frequency: ");
        String nameToFind = sc.nextLine().trim();
        int frequency = Collections.frequency(names, nameToFind);
        System.out.println("Frequency of " + nameToFind + ": " + frequency);
        sc.close();
    }
}
