package Practice;

import java.util.Scanner;

class Work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.println("Enter number of elements:");
            int n = Integer.parseInt(sc.nextLine());
            
            if (n <= 0 || n > 100) {
                System.out.println("Invalid input! Number of elements must be between 1 and 100.");
                return;
            }
            
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                try {
                    System.out.println("Enter element " + (i + 1) + ":");
                    String input = sc.nextLine();
                    arr[i] = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input! Please enter integers only.");
                    System.out.println("An unexpected error occurred.");
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Array index out of bounds.");
                } catch (Exception e) {
                    System.out.println("An unexpected error occurred.");
                }
            }
            
            System.out.println("Numbers entered successfully.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter integers only.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
        } finally {
            sc.close();
        }
    }    
}