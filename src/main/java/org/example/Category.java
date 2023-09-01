package org.example;

import lombok.Getter;

import java.util.ArrayList;

@Getter
public class Category {

    private final String name;
    private final ArrayList<Product> products;


    public Category(String name) {

        this.name = name;

        this.products = new ArrayList<>();

    }

    public void addProduct(Product product) {

        products.add(product);

    }

}
