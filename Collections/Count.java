package Collections;

import java.util.Scanner;
import java.util.PriorityQueue;

public class Count {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i=0; i<size; i++) {
            pq.add(s.nextInt());
        }
        int inserFirst = s.nextInt();
        pq.add(inserFirst);
        System.out.println("Number of elements in the PriorityQueue: "+pq.size());
        s.close();
    }
}
