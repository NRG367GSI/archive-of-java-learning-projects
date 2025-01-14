package org.skypro.skyshop.product;

public class DiscountedProduct extends Product {
    private final int basePrice;
    private final int discount;

    public DiscountedProduct(String productName, int basePrice, int discount) {
        super(productName);
        this.basePrice = basePrice;
        this.discount = discount;
    }

    @Override
    public int getPriceProduct() {
        return (int) basePrice * (1 - discount / 100);
    }

    @Override
    public String toString() {
        return "DiscountedProduct{" +
                "basePrice=" + basePrice +
                ", discount=" + discount +
                ", productName='" + productName + '\'' +
                '}';
    }


}
