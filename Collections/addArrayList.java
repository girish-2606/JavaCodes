package Collections;
//import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;;
public class addArrayList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        ArrayList<String> list = new ArrayList<String>();
        for(int i=0; i<size; i++) {
            list.add(s.next());
        }
        int ind = s.nextInt();
        String value = s.next();
        list.add(ind, value);
        System.out.println("Updated ArrayList: ");
        for(Object x: list) {
            System.out.print(x+" ");
        }
        s.close();
    }
}
