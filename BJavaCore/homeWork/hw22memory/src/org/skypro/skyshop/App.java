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

        //Печать содержимого корзины с несколькими товарами.
        System.out.println("Содержимое корзины:");
        basket.printBasket();

        //Получение стоимости корзины с несколькими товарами.
        System.out.println("Вывод общей стоймости");
        System.out.println(basket.totalCost());

        //Поиск товара, который есть в корзине.
        System.out.println("Проверка продукта в корзине по имени");
        System.out.println(basket.isProduct("Apple"));

        //Поиск товара, которого нет в корзине.
        System.out.println("Проверка продукта в корзине по имени");
        System.out.println(basket.isProduct("Strawberry"));

        //Очистка корзины.
        System.out.println("Очистка корзины");
        basket.removeBasket();

        //Печать содержимого пустой корзины.
        basket.printBasket();

        //Получение стоимости пустой корзины.
        System.out.println("Получение стоимости пустой корзины.");
        System.out.println(basket.totalCost());

        //Поиск товара по имени в пустой корзине.
        System.out.println("Поиск товара по имени в пустой корзине.");
        System.out.println(basket.isProduct("Strawberry"));
    }
}