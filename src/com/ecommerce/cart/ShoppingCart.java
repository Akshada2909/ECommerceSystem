
package com.ecommerce.cart;

import java.util.ArrayList;

import com.ecommerce.products.Product;

public class ShoppingCart {

    private ArrayList<CartItem> items = new ArrayList<>();

    public void addItem(CartItem item) {
        items.add(item);
    }

    public void displayCart() {
        System.out.println("\n=== SHOPPING CART ===");
        System.out.printf("%-15s %-20s %-10s %-10s %-10s%n",
                "Product ID", "Name", "Price", "Qty", "Total");
        System.out.println("----------------------------------------------------------------------");

        double total = 0;
        for (CartItem item : items) {
            System.out.printf("%-15s %-20s ₹%-9.2f %-10d ₹%-9.2f%n",
                    item.getProduct().getId(),
                    item.getProduct().getName(),
                    item.getProduct().getFinalPrice(),
                    item.getQuantity(),
                    item.getTotalPrice());
            total += item.getTotalPrice();
        }
        System.out.println("----------------------------------------------------------------------");
        System.out.printf("Total Amount: ₹%.2f%n", total);
    }

    public double getTotal() {
        return items.stream().mapToDouble(CartItem::getTotalPrice).sum();
    }

    public ArrayList<CartItem> getItems() {
        return items;
    }
    
    public void updateItem(String productId, int newQty) {

        for (CartItem item : items) {

            if (item.getProduct().getId().equalsIgnoreCase(productId)) {

                if (newQty <= 0) {
                    items.remove(item);
                    System.out.println("❌ Item removed from cart.");
                    return;
                }

                item.setQuantity(newQty);
                System.out.println("✅ Cart updated successfully.");
                return;
            }
        }
        System.out.println("Product not found in cart.");
    }

	
}


