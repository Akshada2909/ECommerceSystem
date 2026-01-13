
package com.ecommerce.cart;

import com.ecommerce.products.Product;

/*
 * Represents one item inside shopping cart
 */
public class CartItem {

    private Product product;
    private int quantity;

    public CartItem(Product product, int qty) {
        this.product = product;
        this.quantity = qty;
    }

    public double getTotalPrice() {
        return product.getFinalPrice() * quantity;
    }

    public Product getProduct() 
    { 
    	return product;
    }
    public int getQuantity() 
    { 
    	return quantity; 
    }
    
 
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
