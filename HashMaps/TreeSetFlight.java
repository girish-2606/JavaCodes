package HashMaps;

import java.util.Scanner;
import java.util.TreeMap;

public class TreeSetFlight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<String, String> flightMap = new TreeMap<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String airline = sc.next();
            String flightTime = sc.next();
            flightMap.put(flightTime, airline);
        }
        for (String flightTime : flightMap.keySet()) {
            System.out.println("Added: " + flightMap.get(flightTime) + " at " + flightTime);
        }
        String searchTime = sc.next();
        String removeTime = sc.next();
        if (flightMap.containsKey(searchTime)) {
            System.out.println("Flight at " + searchTime + ": " + flightMap.get(searchTime));
        } else {
            System.out.println("No flight found at " + searchTime);
        }
        if (flightMap.containsKey(removeTime)) {
            String removedAirline = flightMap.remove(removeTime);
            System.out.println("Flight removed: " + removedAirline + " at " + removeTime);
        } else {
            System.out.println("Flight not found at " + removeTime);
        }
        for (String flightTime : flightMap.keySet()) {
            System.out.println(flightTime + " -> " + flightMap.get(flightTime));
        }
    }
}
