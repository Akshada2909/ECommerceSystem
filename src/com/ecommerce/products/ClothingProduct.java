
package com.ecommerce.products;

public class ClothingProduct extends Product {

    private String size;
    private String color;
    private String material;

    public ClothingProduct(String id, String name, double price, String desc,
                            int stock, String size, String color, String material) {
        super(id, name, price, desc, stock);
        this.size = size;
        this.color = color;
        this.material = material;
    }

    @Override
    public double getDiscount() {
        return price * 0.15; // 15% discount
    }

    @Override
    public void displayDetails() {
        System.out.println("👕 CLOTHING:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.printf("Price: ₹%.2f%n", price);
        System.out.println("Description: " + description);
        System.out.println("Stock: " + stock);
        System.out.printf("Discount: ₹%.2f%n", getDiscount());
        System.out.printf("Final Price: ₹%.2f%n", getFinalPrice());
        System.out.println("Type: Clothing");
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("----------------------------------------");
    }
}
