package Comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ObjectSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        ArrayList<Employee> employees = new ArrayList<>();
        System.out.println("Enter the name and salary of each employee:");
        for(int i = 0; i < n; i++) {
            String name = sc.nextLine();
            double salary = sc.nextDouble();
            sc.nextLine(); // Consume the newline character
            employees.add(new Employee(name, salary));
        }
        //Employees sorted by salary salary
        Collections.sort(employees, new SalaryComparator());
        System.out.println("Employees sorted by salary:");
        for(Employee emp : employees) {
            System.out.println(emp);
        }
    }
}

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + "}";
    }
}

class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Double.compare(e1.getSalary(), e2.getSalary());
    }
}
