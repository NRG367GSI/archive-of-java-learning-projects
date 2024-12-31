package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {
        Product apple = new Product("Apple", 100);
        Product banana = new Product("Banana", 150);
        Product orange = new Product("Orange", 120);
        Product mango = new Product("Mango", 200);
        Product pineapple = new Product("Pineapple", 250);
        Product watermelon = new Product("Watermelon", 300);
        Product kiwi = new Product("Kiwi", 80);

        ProductBasket basket = new ProductBasket(5);

        //Добавление продукта в корзину.
        basket.addProduct(apple);
        basket.addProduct(banana);
        basket.addProduct(orange);
        basket.addProduct(mango);
        basket.addProduct(pineapple);

        //Добавление продукта в заполненную корзину, в которой нет свободного места.
        basket.addProduct(watermelon);
        basket.addProduct(kiwi);
    }
}