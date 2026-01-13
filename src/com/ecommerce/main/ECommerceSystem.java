
package com.ecommerce.main;

import java.util.*;
import com.ecommerce.products.*;
import com.ecommerce.cart.*;
import com.ecommerce.orders.*;

public class ECommerceSystem {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Product> products = new ArrayList<>();
    static ShoppingCart cart = new ShoppingCart();

    public static void main(String[] args) {

        // Sample products
        products.add(new ElectronicsProduct("E01", "Samsung Galaxy S24 Ultra", 50000,
                "Latest smartphone with 5G", 50, "TechBrand", 24));

        products.add(new ClothingProduct("C01", "Kurti Set", 1200,
                "100% Kurti with Pant and Dupatta Set", 100, "L", "Violet", "Rayon"));

        products.add(new BookProduct("B01", "Java Programming", 700,
                "Learn Java from core to advance", 75, "John Doe",
                "978-3-16-148410-0", 500));

        while (true) {
            System.out.println("\n=== E-COMMERCE SYSTEM ===");
            System.out.println("1. View Products");
            System.out.println("2. Add to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Update Cart");
            System.out.println("5. Checkout");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> products.forEach(Product::displayDetails);

                case 2 -> {
                    System.out.print("Enter Product ID to add: ");
                    String id = sc.next();
                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    for (Product p : products) {
                        if (p.getId().equalsIgnoreCase(id) && p.getStock() >= qty) {
                            cart.addItem(new CartItem(p, qty));
                            p.reduceStock(qty);
                            System.out.println("✅ " + p.getName() + " added to cart!");
                        }
                    }

                }

                case 3 -> cart.displayCart();
                
                case 4 -> {
                    System.out.print("Enter Product ID to update: ");
                    String pid = sc.next();

                    System.out.print("Enter new quantity (0 to remove): ");
                    int newQty = sc.nextInt();

                    cart.updateItem(pid, newQty);
                }

                case 5 -> {
                    Order order = new Order(cart);
                    order.displayOrder();
                }

                case 6 -> {
                    System.out.println("\nThank you for using the E-Commerce System!");
                    System.out.println("Your session has ended successfully. 😊");
                    System.exit(0);
                }

            }
        }
    }
}
