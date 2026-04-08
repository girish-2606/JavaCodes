package HashSet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Objects;


public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        HashSet<Car> cars = new HashSet<>();


        int n = sc.nextInt();
        sc.nextLine();


        for (int i = 0; i < n; i++) {


            String model = sc.next();
            int year = sc.nextInt();


            Car car = new Car(model, year);
            cars.add(car);
        }


        System.out.println("Unique cars in the HashSet:");


        for (Car car : cars) {
            System.out.println(car);
        }


        sc.close();
    }
}


class Car {


    private String model;
    private int year;


    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }


    @Override
    public boolean equals(Object obj) {


        Car car = (Car) obj;


        if (year == car.year && model.equals(car.model)) {
            return true;
        } else {
            return false;
        }
    }


    @Override
    public int hashCode() {
        return Objects.hash(model, year);
    }


    @Override
    public String toString() {
        return "Car{model='" + model + "', year=" + year + "}";
    }
}