package com.kodilla.good.patterns.challenges.challenge.two;

public class Product {

    private String productName;
    private int amountOfProduct;

    public Product(String productName, int amountOfProduct) {
        this.productName = productName;
        this.amountOfProduct = amountOfProduct;
    }

    public String getProductName() {
        return productName;
    }

    public int getAmountOfProduct() {
        return amountOfProduct;
    }

}
