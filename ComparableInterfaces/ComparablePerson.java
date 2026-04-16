package ComparableInterfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ComparablePerson {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of people: ");
            int n = sc.nextInt();
            ArrayList<Person> people = new ArrayList<>();
            for (int i = 0; i < n; i++) {   
                System.out.print("Enter name and age of person " + (i + 1) + ": ");
                String name = sc.next();
                int age = sc.nextInt();
                people.add(new Person(name, age));
            }

            Collections.sort(people, (p1, p2) -> p1.compareTo(p2)); // Sort using compareTo method
            System.out.println("People sorted by age:");   
            for (Person p : people) {
                System.out.println("Name: " + p.name + ", Age: " + p.age);
            }
        }
    }
}

class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        return this.age - other.age; // Sort by age
    }
}
