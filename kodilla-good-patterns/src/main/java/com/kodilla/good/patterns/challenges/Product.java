package com.kodilla.good.patterns.challenges;

public class Product {

    String productName;
    int amountOfProduct;

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
