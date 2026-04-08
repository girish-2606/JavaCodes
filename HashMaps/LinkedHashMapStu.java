package HashMaps;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class LinkedHashMapStu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<Integer, String> stuMap = new LinkedHashMap<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int stuId = sc.nextInt();
            String stuName = sc.next();
            stuMap.put(stuId, stuName);
        }
        for (Integer stuId : stuMap.keySet()) {
            System.out.println("Added: Roll " + stuId + " -> " + stuMap.get(stuId));
        }
        int searchId = sc.nextInt();
        if (stuMap.containsKey(searchId)) {
            System.out.println("Student Name: " + stuMap.get(searchId));
        } else {
            System.out.println("Student not found.");
        }
        int removeId = sc.nextInt();
        if (stuMap.containsKey(removeId)) {
            String removedName = stuMap.remove(removeId);
            System.out.println("Student removed: " + removedName);
        } else {
            System.out.println("Student removal failed: ID " + removeId + " not found");
        }
        for (Integer stuId : stuMap.keySet()) {
            System.out.println("Roll: " + stuId + ", Name: " + stuMap.get(stuId));
        }
    }
}
