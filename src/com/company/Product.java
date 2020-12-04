package com.company;

import java.util.ArrayList;

public abstract class Product {
    private int productId;
    private int price;

    // MASTER CLASS CONSTRUCTOR BELOW

    public Product(int productId, int price) {
        this.productId = productId;
        this.price = price;
    }

    public String printDetails() {
        return null;
    }

    // GETTERS AND SETTERS BELOW

    public int getProductId() { return productId; }
    public int getPrice() { return price;   }

    public void setProductId(int productId) { this.productId = productId; }
    public void setPrice(int price) { this.price = price; }
}
