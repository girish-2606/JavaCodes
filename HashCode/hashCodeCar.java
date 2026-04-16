package HashCode;

import java.util.HashSet;
import java.util.Scanner;

class Car {
    String model;
    int year;

    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public int hashCode() {
        return model.hashCode() + year;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Car car = (Car) obj;
        return model.equals(car.model) && year == car.year;
    }

    @Override
    public String toString() {
        return "Car{model='" + model + "', year=" + year + "}";
    }
}

public class hashCodeCar {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            HashSet<Car> set = new HashSet<>();

            for (int i = 0; i < n; i++) {
                String model = sc.next();
                int year = sc.nextInt();
                set.add(new Car(model, year));
            }

            System.out.println("Unique cars in the HashSet:");
            for (Car car : set) {
                System.out.println(car);
            }
        }
    }
}

