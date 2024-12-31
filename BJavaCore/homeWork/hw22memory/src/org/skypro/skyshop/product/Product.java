package org.skypro.skyshop.product;

import java.util.Objects;

public class Product {
    private final String productName;
    private final int priceProduct;

    public Product(String productName, int priceProduct) {
        this.productName = productName;
        this.priceProduct = priceProduct;
    }

    public String getProductName() {
        return productName;
    }

    public int getPriceProduct() {
        return priceProduct;
    }

    @Override
    public String toString() {
        return productName + " : " + priceProduct;
    }


}
