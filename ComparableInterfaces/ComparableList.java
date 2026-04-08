package ComparableInterfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ComparableList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of products:");
        int n = sc.nextInt();
        ArrayList<Product> products = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name and price of product " + (i + 1) + ":");
            String name = sc.next();
            double price = sc.nextDouble();
            products.add(new Product(name, price));
        }
        Collections.sort(products, (p1, p2) -> p1.compareTo(p2)); // Sort using compareTo method
        System.out.println("Products sorted by price:");   
        for (Product p : products) {
            System.out.println("Product{name='" + p.name + "', price=" + p.price + "}");
        }
    }
}

class Product implements Comparable<Product> {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Product other) {
        return Double.compare(this.price, other.price); // Sort by price
    }
}
