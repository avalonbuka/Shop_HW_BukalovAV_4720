package org.example;

import lombok.Getter;

@Getter
public class Product {
    private String name;
    private double price;
    private int rating;

    public Product() {
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Product(String name, double price, int rating) {

        this.name = name;
        this.price = price;
        this.rating = rating;

    }


}
