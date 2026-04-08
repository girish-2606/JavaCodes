package HashCode;

import java.util.HashSet;
import java.util.Scanner;

public class hashCodePerson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Person> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int age = sc.nextInt();
            set.add(new Person(name, age));
        }
        System.out.println("Unique people in the HashSet:");
        for (Person person : set) {
            System.out.println(person);
        }
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }

    @Override
    public boolean equals(Object obj) {
        Person person = (Person) obj;
        return name.equals(person.name) && age == person.age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
