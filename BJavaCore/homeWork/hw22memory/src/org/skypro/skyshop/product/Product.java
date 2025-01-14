package org.skypro.skyshop.product;


public abstract class Product {
    protected final String productName;

    public Product(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public abstract int getPriceProduct();

    @Override
    public abstract String toString();




}
