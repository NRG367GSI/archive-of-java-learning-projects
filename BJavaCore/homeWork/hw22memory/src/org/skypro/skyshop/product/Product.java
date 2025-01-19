package org.skypro.skyshop.product;


import org.skypro.skyshop.content.Searchable;

public abstract class Product implements Searchable {
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

    @Override
    public String searchTerm() {
        return productName;
    }

    @Override
    public String getContentType() {
        return "PRODUCT";
    }

    @Override
    public String getTitle() {
        return productName;
    }
}
