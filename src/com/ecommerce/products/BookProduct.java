
package com.ecommerce.products;

public class BookProduct extends Product {

    private String author;
    private String isbn;
    private int pages;

    public BookProduct(String id, String name, double price, String desc,
                       int stock, String author, String isbn, int pages) {
        super(id, name, price, desc, stock);
        this.author = author;
        this.isbn = isbn;
        this.pages = pages;
    }

    @Override
    public double getDiscount() {
        return price * 0.10;
    }

    @Override
    public void displayDetails() {
        System.out.println("📚 BOOKS:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.printf("Price: ₹%.2f%n", price);
        System.out.println("Description: " + description);
        System.out.println("Stock: " + stock);
        System.out.printf("Discount: ₹%.2f%n", getDiscount());
        System.out.printf("Final Price: ₹%.2f%n", getFinalPrice());
        System.out.println("Type: Book");
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Pages: " + pages);
        System.out.println("----------------------------------------");
    }
}

