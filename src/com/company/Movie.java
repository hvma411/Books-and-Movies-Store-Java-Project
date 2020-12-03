package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Movie extends Product {
    private String title;
    private MovieGenre genre;
    private String author;

    // MOVIE CONSTRUCTOR BELOW

    public Movie(String title, MovieGenre genre, String author, int productId, int price) {
        super(productId, price);
        this.title = title;
        this.genre = genre;
        this.author = author;
    }

    //METHOD TO PRINT MOVIE DETAILS BELOW

    public String printMovieDetails() {
        return String.format("Title: %s \nGenre: %s \nPrice: %d PLN \nAuthor: %s \nProduct ID: %d \n", getTitle(), getGenre(), getPrice(), author, getProductId());
    }

    //JUST OVERRIDED toString() METHOD BELOW

    @Override
    public String toString() {
        return printMovieDetails();
    }

    // GETTERS BELOW

    public String getTitle() {
        return title;
    }
    public MovieGenre getGenre() {
        return genre;
    }

}
