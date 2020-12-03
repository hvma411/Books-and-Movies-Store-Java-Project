package com.company;

public class ChildrensBook extends Book {
    private String recommendedAgeInfo;

    // CHILDREN BOOK CONSTRUCTOR BELOW

    public ChildrensBook(String title, String author, int productId, int price, String recommendedAgeInfo) {
        super(title, author, productId, price);
        this.recommendedAgeInfo = recommendedAgeInfo;
    }

    // OVERRIDED METHOD TO PRINT BOOK DETAILS IF IT'S CHILDRENS BOOK BELOW

    @Override
    public String printBookDetails() {
        return String.format("Title: %s \nAuthor: %s \nPrice: %d PLN \nAge: %s \nProduct ID: %d \n", getTitle(), getAuthor(), getPrice(), recommendedAgeInfo, getProductId());
    }

    // GETTER AND SETTER BELOW

    public String getRecommendedAgeInfo() { return recommendedAgeInfo; }
    public void setRecommendedAgeInfo(String recommendedAgeInfo) { this.recommendedAgeInfo = recommendedAgeInfo;    }
}
