package HashMaps;

import java.util.HashMap;
import java.util.Map;

public class HashMapStudent {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20);
        Student s2 = new Student("Bob", 22);
        HashMap<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1, s1);
        studentMap.put(2, s2);
        System.out.println(studentMap);
        System.out.println(studentMap.keySet()); 
        // Output: [1, 2]
        System.out.println(studentMap.values()); 
        // Output: [Student{name='Alice', age=20}, Student{name='Bob', age=22}]
        System.out.println(studentMap.entrySet()); 
        // Output: [1=Student{name='Alice', age=20}, 2=Student{name='Bob', age=22}]
        for(Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        // Using forEach Loop
        //output: Key: 1, Value: Student{name='Alice', age=20}
        //        Key: 2, Value: Student{name='Bob', age=22}
    }
} 
 
class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}
