package org.skypro.skyshop;

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

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Product product = (Product) object;
        return priceProduct == product.priceProduct && Objects.equals(productName, product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, priceProduct);
    }
}
