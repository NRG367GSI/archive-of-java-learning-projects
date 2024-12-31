package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

public class ProductBasket {
    private final Product[] basket;

    public ProductBasket(int size) {
        this.basket = new Product[size];
    }

}
