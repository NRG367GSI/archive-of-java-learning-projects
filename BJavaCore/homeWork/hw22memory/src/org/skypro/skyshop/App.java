package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.content.Article;
import org.skypro.skyshop.content.SearchEngine;
import org.skypro.skyshop.content.Searchable;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;

public class App {
    public static void main(String[] args) {

        Product apple = new DiscountedProduct("Apple", 100, 10);
        Product banana = new SimpleProduct("Banana", 50);
        Product milk = new FixPriceProduct("Milk");
        Product cheese = new DiscountedProduct("Cheese", 200, 20);
        Product yogurt = new FixPriceProduct("Yogurt");
        Product tomato = new DiscountedProduct("Tomato", 40, 10);
        Product potato = new SimpleProduct("Potato", 30);
        ;

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

        //Создайте один объект типа SearchEngine
        System.out.println("Создайте один объект типа SearchEngine");
        SearchEngine se = new SearchEngine(5);

        // Создаем статьи с описаниями товаров
        Article article1 = new Article(
                "Яблоки",
                "Свежие яблоки с местных садов. Идеально подходят для перекуса или приготовления десертов."
        );

        Article article2 = new Article(
                "Бананы",
                "Спелые бананы, богатые калием. Отлично подходят для здорового перекуса."
        );

        Article article3 = new Article(
                "Молоко",
                "Свежее молоко с местной фермы. Идеально для приготовления каш, кофе и других блюд."
        );

        Article article4 = new Article(
                "Сыр",
                "Натуральный сыр, изготовленный из коровьего молока. Отлично подходит для бутербродов и закусок."
        );

        Article article5 = new Article(
                "Йогурт",
                "Натуральный йогурт без добавок. Подходит для завтрака или легкого перекуса."
        );

        // Добавляем статьи в SearchEngine
        se.addSearchable(article1);
        se.addSearchable(article2);
        se.addSearchable(article3);
        se.addSearchable(article4);
        se.addSearchable(article5);

        // Ищем и выводим результаты
        System.out.println("Результаты поиска по запросу 'яблоки':");
        Searchable[] appleResults = se.search("яблоки");
        for (Searchable result : appleResults) {
            if (result != null) { // Проверка на null
                System.out.println(result.getTitle());
            }
        }

        System.out.println("\nРезультаты поиска по запросу 'бананы':");
        Searchable[] bananaResults = se.search("бананы");
        for (Searchable result : bananaResults) {
            if (result != null) { // Проверка на null
                System.out.println(result.getSearchTerm());
            }
        }

        System.out.println("\nРезультаты поиска по запросу 'молоко':");
        Searchable[] milkResults = se.search("молоко");
        for (Searchable result : milkResults) {
            if (result != null) { // Проверка на null
                System.out.println(result.getStringRepresentation());
            }


        }
    }
}