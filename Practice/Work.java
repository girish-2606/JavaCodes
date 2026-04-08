package Practice;

import java.util.Scanner;

class Work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of an array: ");
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for(int i=0; i<n; i++) {
        //     arr[i]=sc.nextInt();
        // }
        // int budget = sc.nextInt();
        // System.out.print("Input: prices = [");
        // for(int i=0; i<n; i++) {
        //     if(i < arr.length-1) {
        //         System.out.print(arr[i]+", ");
        //     } else {
        //         System.out.print(arr[i]);
        //     }
        // }
        // System.out.print("], budget = "+budget);

        // for(int i=1; i<=5; i++) {
        //     System.out.println(i);
        //     try {
        //         Thread.sleep(3000);
        //     } catch (Exception e) {
        //         e.printStackTrace();
        //     }
        // }

        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        int res = a/b;
        System.out.println(res);
    }    
}