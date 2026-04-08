package Comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Reverse_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        ArrayList<Integer> digits = new ArrayList<>();
        for(int i=0; i<num; i++) {
            digits.add(sc.nextInt());
        }
        Collections.sort(digits, new reverseComparator());
        System.out.println("Numbers in descending order:");
        for (Integer digit : digits) {
            System.out.print(digit + " ");
        }
        sc.close();
    }
}

class reverseComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b) {
        return b.compareTo(a);
    }
}