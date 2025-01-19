package org.skypro.skyshop.product;

public class SimpleProduct extends Product{
    private final int priceProduct;

    public SimpleProduct(String productName, int priceProduct) {
        super(productName);
        this.priceProduct = priceProduct;
    }

    @Override
    public int getPriceProduct() {
        return this.priceProduct;
    }

    @Override
    public String toString() {
        return productName + " : " + priceProduct;
    }

    @Override
    public boolean isSpecial() {
        return false;
    }
}
