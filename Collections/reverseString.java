package Collections;

import java.util.ArrayDeque;
import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to reverse:");
        String str = sc.nextLine();
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }
        StringBuilder reversedStr = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedStr.append(stack.pop());
        }
        System.out.println("Reversed string: " + reversedStr.toString());
        sc.close();
    }
}
