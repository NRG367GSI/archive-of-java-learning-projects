package org.skypro.skyshop.product;

public class FixPriceProduct extends Product{

    private static final int PRICE_PRODUCT;

    static {
        PRICE_PRODUCT = 100;
    }

    public FixPriceProduct(String productName) {
        super(productName);
    }

    @Override
    public int getPriceProduct() {
        return PRICE_PRODUCT;
    }

    @Override
    public String toString() {
        return "FixPriceProduct{" +
                "FixPriceProduct='" + getPriceProduct() +
                "productName='" + productName + '\'' +
                '}';
    }
}
