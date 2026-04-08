package Collections;
//import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;;
public class setArrayList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<size; i++) {
            list.add(s.nextInt());
        }
        int ind = s.nextInt();
        int value = s.nextInt();
        list.set(ind, value);
        System.out.println("Updated ArrayList: ");
        for(Object x: list) {
            System.out.print(x+" ");
        }
        s.close();
    }
}
