
package com.ecommerce.products;

/*
 * Abstract Product class
 * Base class for all product types
 */
public abstract class Product {

    protected String id;
    protected String name;
    protected double price;
    protected String description;
    protected int stock;

    public Product(String id, String name, double price, String description, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.stock = stock;
    }

    // Abstract method for discount (polymorphism)
    public abstract double getDiscount();

    public double getFinalPrice() {
        return price - getDiscount();
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }

    public void reduceStock(int qty) {
        this.stock -= qty;
    }
    
    

    public abstract void displayDetails();
}

