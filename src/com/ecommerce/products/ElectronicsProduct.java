
package com.ecommerce.products;

public class ElectronicsProduct extends Product {

    private String brand;
    private int warrantyMonths;

    public ElectronicsProduct(String id, String name, double price, String desc,
                              int stock, String brand, int warrantyMonths) {
        super(id, name, price, desc, stock);
        this.brand = brand;
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public double getDiscount() {
        return price * 0.10; // 10% discount
    }

    @Override
    public void displayDetails() {
        System.out.println("📱 ELECTRONICS:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.printf("Price: ₹%.2f%n", price);
        System.out.println("Description: " + description);
        System.out.println("Stock: " + stock);
        System.out.printf("Discount: ₹%.2f%n", getDiscount());
        System.out.printf("Final Price: ₹%.2f%n", getFinalPrice());
        System.out.println("Type: Electronics");
        System.out.println("Brand: " + brand);
        System.out.println("Warranty: " + warrantyMonths + " months");
        System.out.println("----------------------------------------");
    }
}
