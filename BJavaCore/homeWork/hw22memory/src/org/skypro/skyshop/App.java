package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;

public class App {
    public static void main(String[] args) {
//        Product apple = new SimpleProduct("Apple", 100);
//        Product banana = new SimpleProduct("Banana", 150);
//        Product orange = new SimpleProduct("Orange", 120);
//        Product mango = new SimpleProduct("Mango", 200);
//        Product pineapple = new SimpleProduct("Pineapple", 250);
//        Product watermelon = new SimpleProduct("Watermelon", 300);
//        Product kiwi = new SimpleProduct("Kiwi", 80);
//
//        ProductBasket basket = new ProductBasket(5);
//
//        //Добавление продукта в корзину.
//        basket.addProduct(apple);
//        basket.addProduct(banana);
//        basket.addProduct(orange);
//        basket.addProduct(mango);
//        basket.addProduct(pineapple);
//
//        //Добавление продукта в заполненную корзину, в которой нет свободного места.
//        basket.addProduct(watermelon);
//        basket.addProduct(kiwi);
//
//        //Печать содержимого корзины с несколькими товарами.
//        System.out.println("Содержимое корзины:");
//        basket.printBasket();
//
//        //Получение стоимости корзины с несколькими товарами.
//        System.out.println("Вывод общей стоймости");
//        System.out.println(basket.totalCost());
//
//        //Поиск товара, который есть в корзине.
//        System.out.println("Проверка продукта в корзине по имени");
//        System.out.println(basket.checkProductExist("Apple"));
//
//        //Поиск товара, которого нет в корзине.
//        System.out.println("Проверка продукта в корзине по имени");
//        System.out.println(basket.checkProductExist("Strawberry"));
//
//        //Очистка корзины.
//        System.out.println("Очистка корзины");
//        basket.clearBasket();
//
//        //Печать содержимого пустой корзины.
//        basket.printBasket();
//
//        //Получение стоимости пустой корзины.
//        System.out.println("Получение стоимости пустой корзины.");
//        System.out.println(basket.totalCost());
//
//        //Поиск товара по имени в пустой корзине.
//        System.out.println("Поиск товара по имени в пустой корзине.");
//        System.out.println(basket.checkProductExist("Strawberry"));


        //КЛАСС DiscountedProduct
        Product apple = new DiscountedProduct("Apple", 100, 10);
        Product banana = new SimpleProduct("Banana", 50);
        Product milk = new FixPriceProduct("Milk");
        Product cheese = new DiscountedProduct("Cheese", 200, 20);
        Product yogurt = new FixPriceProduct("Yogurt");
        Product tomato = new DiscountedProduct("Tomato", 40, 10);
        Product potato = new SimpleProduct("Potato", 30);;

        ProductBasket basket = new ProductBasket(5);

        //Добавление продукта в корзину.
        basket.addProduct(apple);
        basket.addProduct(banana);
        basket.addProduct(milk);
        basket.addProduct(cheese);
        basket.addProduct(yogurt);

        //Добавление продукта в заполненную корзину, в которой нет свободного места.
        basket.addProduct(tomato);
        basket.addProduct(potato);

        //Печать содержимого корзины с несколькими товарами.
        System.out.println("Содержимое корзины:");
        basket.printBasket();

        //Получение стоимости корзины с несколькими товарами.
        System.out.println("Вывод общей стоймости");
        System.out.println(basket.totalCost());

        //Поиск товара, который есть в корзине.
        System.out.println("Проверка продукта в корзине по имени");
        System.out.println(basket.checkProductExist("Apple"));

        //Поиск товара, которого нет в корзине.
        System.out.println("Проверка продукта в корзине по имени");
        System.out.println(basket.checkProductExist("Strawberry"));

        //Очистка корзины.
        System.out.println("Очистка корзины");
        basket.clearBasket();

        //Печать содержимого пустой корзины.
        basket.printBasket();

        //Получение стоимости пустой корзины.
        System.out.println("Получение стоимости пустой корзины.");
        System.out.println(basket.totalCost());

        //Поиск товара по имени в пустой корзине.
        System.out.println("Поиск товара по имени в пустой корзине.");
        System.out.println(basket.checkProductExist("Strawberry"));
    }
}