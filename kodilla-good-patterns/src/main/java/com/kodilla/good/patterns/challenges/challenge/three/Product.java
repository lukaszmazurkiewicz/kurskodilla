package com.kodilla.good.patterns.challenges.challenge.three;

public class Product {

    private String nameOfProduct;
    private int amountOfProductInStock;

    public Product(String nameOfProduct, int amountOfProductInStock) {
        this.nameOfProduct = nameOfProduct;
        this.amountOfProductInStock = amountOfProductInStock;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public int getAmountOfProductInStock() {
        return amountOfProductInStock;
    }
}
