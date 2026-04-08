package Collections;

import java.util.LinkedList;
import java.util.Scanner;

public class GetfirstLast {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LinkedList<String> ll = new LinkedList<>();
        int att = Integer.parseInt(s.nextLine());

        for(int i=0; i<att; i++) {
            ll.addLast(s.nextLine());
        }
        System.out.println("First attendee: "+ll.getFirst());
        System.out.println("Last Attendee: "+ll.getLast());
        System.out.println("Number of attendees:  "+ll.size());
        System.out.println("Attendees: ");
        for(String str: ll) {
            System.out.println(str);
        }
        s.close();

    }
}