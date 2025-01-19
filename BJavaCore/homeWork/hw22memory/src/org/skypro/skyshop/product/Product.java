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

    //Метод isSpecial, возвращает true если товар специальный и false, если товар обычный
    //Специальный товар — это товар со скидкой или фиксированной стоимостью
    public abstract boolean isSpecial();
}
