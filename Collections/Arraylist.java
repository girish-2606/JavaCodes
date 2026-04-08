package Collections;
import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();

        for(int i=0;i<size;i++) {
            list.add(s.nextInt());
        }

        int ind = s.nextInt();
        if(ind >= 0 && ind <= list.size()) {
            System.out.println(list.get(ind));
        } else {
            System.out.println("Invalid size");
        }
        s.close();
    }
}
