
package com.ecommerce.orders;

import java.util.Date;
import com.ecommerce.cart.ShoppingCart;

public class Order {

    private static int orderCounter = 1000;
    private String orderId;
    private Date orderDate;
    private ShoppingCart cart;

    public Order(ShoppingCart cart) {
        this.orderId = "ORD" + orderCounter++;
        this.orderDate = new Date();
        this.cart = cart;
    }

    public void displayOrder() {
        System.out.println("\n=== ORDER DETAILS ===");
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);

        cart.displayCart();

        double subtotal = cart.getTotal();
        double gst = subtotal * 0.18;
        double finalAmount = subtotal + gst;

        System.out.println("\nOrder Summary:");
        System.out.printf("Subtotal: ₹%.2f%n", subtotal);
        System.out.printf("GST (18%%): ₹%.2f%n", gst);
        System.out.printf("Final Amount: ₹%.2f%n", finalAmount);

        System.out.println("\n🎉 ORDER CONFIRMED!");
        System.out.println("Status: Processing");
        System.out.println("Estimated Delivery: 2024-01-22");
    }
}

