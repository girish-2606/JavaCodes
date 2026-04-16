package Exception_Handling;

import java.util.Scanner;

public class Program_1 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Connection Established");
            try {
                System.out.println("Enter the value of a: ");
                int a = sc.nextInt();
                System.out.println("Enter the value of b: ");
                int b = sc.nextInt();
                int c = a/b;
                System.out.println(c);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Exception Handled");
            } finally {
                System.out.println("Connection is terminated");
            }
        }
    }
} 