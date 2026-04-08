package HashMaps;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.WeakHashMap;

public class WeakHashMapExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WeakHashMap<Integer, String> empMap = new WeakHashMap<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int empId = sc.nextInt();
            String empName = sc.next();
            empMap.put(empId, empName);
            System.out.println("Added token: " + empId + " -> " + empName);
        }
        System.out.println("Enter a token id to check:");
        int tokenId = sc.nextInt();
        if(empMap.containsKey(tokenId)){
            System.out.println("Token "+tokenId+" exists: true");
        } else {
            System.out.println("Token "+tokenId+" exists: false");
        }
        System.out.println("All Active Sessions Tokens:");
        for(Integer empId : empMap.keySet()) {
            System.out.println(empId + " -> " + empMap.get(empId));
        }
        System.out.println("Enter the number of users:");
        int numUsers = sc.nextInt();
        LinkedHashMap<Integer, String> userMap = new LinkedHashMap<>();
        for (int i = 0; i < numUsers; i++) {
            int userId = sc.nextInt();
            String userName = sc.next();
            userMap.put(userId, userName);
            System.out.println("Added user: " + userId + " -> " + userName);
        }
        System.out.println("Are the two users with the same data identical? " + !(userMap.get(1) == userMap.get(2)));
    }
    
}