package Exception_Handling;

import java.util.Scanner;

public class Program_2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Connection established.");
            try {
                System.out.println("Enter the size of an Array: ");
                int size = sc.nextInt();   
                int arr[] = new int[size];
                System.out.println("Enter the element to insert and index: ");
                int ele = sc.nextInt();
                int ind = sc.nextInt();
                arr[ind] = ele;
                System.out.println("Element is inserted.");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Exception handled");
            } finally {
                System.out.println("Connection terminated.");
            }
        }
    }
}
