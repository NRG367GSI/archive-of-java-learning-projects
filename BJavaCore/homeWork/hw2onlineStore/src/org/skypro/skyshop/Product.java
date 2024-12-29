package org.skypro.skyshop;

import java.util.Objects;

public class Product {
    private String productName;
    private int priceProduct;

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

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPriceProduct(int priceProduct) {
        this.priceProduct = priceProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", priceProduct=" + priceProduct +
                '}';
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
