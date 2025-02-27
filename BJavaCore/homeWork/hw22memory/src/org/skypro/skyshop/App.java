package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.content.Article;
import org.skypro.skyshop.content.BestResultNotFound;
import org.skypro.skyshop.content.SearchEngine;
import org.skypro.skyshop.content.Searchable;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;

import java.util.*;

public class App {
    public static void main(String[] args) {

        Product apple = new DiscountedProduct("Apple", 100, 10);
        Product banana = new SimpleProduct("Banana", 50);
        Product milk = new FixPriceProduct("Milk");
        Product cheese = new DiscountedProduct("Cheese", 200, 20);
        Product yogurt = new FixPriceProduct("Yogurt");
        Product tomato = new DiscountedProduct("Tomato", 40, 10);
        Product potato = new SimpleProduct("Potato", 30);

        ProductBasket basket = new ProductBasket();

        //Добавление продукта в корзину.
        basket.addProduct("apple", apple);
        basket.addProduct("banana", banana);
        basket.addProduct("milk", milk);
        basket.addProduct("cheese", cheese);
        basket.addProduct("yogurt", yogurt);

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

        //Удалить существующий продукт из корзины.
        System.out.println("_________\nУдалить существующий продукт из корзины.");
        System.out.println(basket.removeByName("Banana"));
        basket.printBasket();
        System.out.println("_________\n");

        //Удалить несуществующий продукт.
        System.out.println("_________\nУдалить несуществующий продукт.");
        if (basket.removeByName("cranberry").isEmpty()) {
            System.out.println("Список пуст!");
        } else {
            basket.removeByName("cranberry");
        }
        basket.printBasket();
        System.out.println("_________\n");

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
        SearchEngine se = new SearchEngine();


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

        System.out.println("\nВывод в консоль статей");
        se.printSearchable();
        System.out.println("\n");

        // Ищем и выводим результаты
        System.out.println("Результаты поиска по запросу 'яблоки':");
        Set<Searchable> appleResults = se.search("яблоки");
        for (Searchable result : appleResults) {
            if (result != null) { // Проверка на null
                System.out.println(result.getSearchTerm());
            }
        }

        System.out.println("Результаты поиска по запросу 'бананы':");
        Set<Searchable> bananaResults = se.search("бананы");
        for (Searchable result : bananaResults) {
            if (result != null) { // Проверка на null
                System.out.println(result.getSearchTerm());
            }
        }

        System.out.println("Результаты поиска по запросу 'молоко':");
        Set<Searchable> milkResults = se.search("молоко");
        for (Searchable result : milkResults) {
            if (result != null) { // Проверка на null
                System.out.println(result.getSearchTerm());
            }
        }

        System.out.println("\nДемонстрация проверки данных в классе:\n");
        //Создайте несколько продуктов и нарочно заполните их поля неправильно
        try {
            Product nullProduct = new SimpleProduct("", 10);
        } catch (IllegalArgumentException e) {
            System.out.printf("%s\n%s\n%s", e.getMessage(), e.getCause(), Arrays.toString(e.getStackTrace()));
        }
        System.out.println("\n");

        try {
            Product isBlankProduct = new SimpleProduct("     ", 20);
        } catch (IllegalArgumentException e) {
            System.out.printf("%s\n%s\n%s", e.getMessage(), e.getCause(), Arrays.toString(e.getStackTrace()));
        }
        System.out.println("\n");
        try {
            Product zeroProductPrice = new SimpleProduct("zeroProductPrice", 0);
        } catch (IllegalArgumentException e) {
            System.out.printf("%s\n%s\n%s", e.getMessage(), e.getCause(), Arrays.toString(e.getStackTrace()));
        }
        System.out.println("\n");
        try {
            Product discountSubZero = new DiscountedProduct("discountSubZero", 10, -10);
        } catch (IllegalArgumentException e)  {
            System.out.printf("%s\n%s\n%s", e.getMessage(), e.getCause(), Arrays.toString(e.getStackTrace()));
        }

        try {
            Searchable prod1 = se.substringSearch("яб");
            System.out.println("Самый подходящий продукт: " + prod1.getSearchTerm());
        } catch (BestResultNotFound e) {
            System.out.println(e.getMessage()); // Обработка исключения
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Обработка невалидного поискового запроса
        }


        try {
            Searchable prod2 = se.substringSearch("бя");
            System.out.println("Самый подходящий продукт: " + prod2.getSearchTerm());
        } catch (BestResultNotFound e) {
            System.out.println(e.getMessage()); // Обработка исключения
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Обработка невалидного поискового запроса
        }
    }
}

