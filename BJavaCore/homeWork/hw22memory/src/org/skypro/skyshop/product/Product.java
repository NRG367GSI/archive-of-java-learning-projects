package org.skypro.skyshop.product;

import java.util.Objects;

public class Product {
    private final String productName;
    private final int priceProduct;

    public Product(String productName, int priceProduct) {
        this.productName = productName;
        this.priceProduct = priceProduct;
    }
}
