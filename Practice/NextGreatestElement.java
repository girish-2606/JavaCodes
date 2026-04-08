package Practice;

import java.util.Arrays;
import java.util.Scanner;

class NextGreatestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();

        int[] num1 = new int[n1];

        for (int i = 0; i < num1.length; i++) {
            num1[i] = sc.nextInt();
        }
        
        int n2 = sc.nextInt();

        int[] num2 = new int[n2];

        for (int i = 0; i < num2.length; i++) {
            num2[i] = sc.nextInt();
        }

        int[] result = nextGreaterElement(num1, num2);
        System.out.println(Arrays.toString(result));
        sc.close();
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
       
        return new int[nums1.length];
    }
}