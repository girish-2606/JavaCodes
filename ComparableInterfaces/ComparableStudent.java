package ComparableInterfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ComparableStudent {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of students: ");
            int n = sc.nextInt();
            ArrayList<Student> students = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                System.out.print("Enter roll number, name and marks of student " + (i + 1) + ": ");
                int rollNo = sc.nextInt();
                String name = sc.next();
                int marks = sc.nextInt();
                students.add(new Student(rollNo, name, marks));
            }
            Collections.sort(students, (s1, s2) -> s1.rollNo - s2.rollNo);
            System.out.println("Students sorted by roll number:");
            for (Student s : students) {    
                System.out.println("Roll No: " + s.rollNo + ", Name: " + s.name + ", Marks: " + s.marks);
            }
        }   
    }
}

class Student implements Comparable<Student> {
    int rollNo;
    String name;
    int marks;

    public Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student other) {
        return this.marks - other.marks; // Sort by marks
    }

}
