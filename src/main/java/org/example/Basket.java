package org.example;

import lombok.Getter;

import java.util.ArrayList;


@Getter
public class Basket {

    private final ArrayList<Product> products;
    public Product[] purchasedProducts;


    public Basket() {

        this.products = new ArrayList<>();

    }


    public void addProduct(Product product) {

        products.add(product);

    }


    public void removeProduct(Product product) {

        products.remove(product);

    }

}
