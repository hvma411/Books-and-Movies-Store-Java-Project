package com.company;

public class Book extends Product {
    private String title;
    private String author;

    // BOOK CONSTRUCTOR BELOW

    public Book(String title, String author, int productId, int price) {
        super(productId, price);
        this.title = title;
        this.author = author;
    }

    // METHOD TO PRINT BOOK DETAILS BELOW

    public String printBookDetails() {
        return String.format("Title: %s \nAuthor: %s \nPrice: %d PLN \nProduct ID: %d\n", title, author, getPrice(), getProductId());
    }

    //JUST OVERRIDED toString() METHOD BELOW

    @Override
    public String toString() {
        return printBookDetails();
    }

    // GETTERS BELOW

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
}
