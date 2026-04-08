package HashMaps;

import java.util.HashMap;
import java.util.Scanner;

public class HashmapEmp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> empMap = new HashMap<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int empId = sc.nextInt();
            String empName = sc.next();
            empMap.put(empId, empName);
        }
        for (Integer empId : empMap.keySet()) {
            System.out.println("Added: ID " + empId + " -> " + empMap.get(empId));
        }

        // lookup an employee by ID and print name
        int searchId = sc.nextInt();
        if (empMap.containsKey(searchId)) {
            System.out.println("Employee Name: " + empMap.get(searchId));
        } else {
            System.out.println("Employee not found.");
        }

        // remove an employee by ID and report removal
        int removeId = sc.nextInt();
        if (empMap.containsKey(removeId)) {
            String removedName = empMap.remove(removeId);
            System.out.println("Employee removed: " + removedName);
        } else {
            System.out.println("Employee removal failed: ID " + removeId + " not found");
        }

        // print remaining employees
        for (Integer empId : empMap.keySet()) {
            System.out.println("ID: " + empId + ", Name: " + empMap.get(empId));
        }
    }
}
