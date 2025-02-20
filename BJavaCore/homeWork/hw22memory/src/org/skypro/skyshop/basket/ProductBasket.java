package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.*;

public class ProductBasket {
    private final Map <String, List<Product>> basket;

    public ProductBasket() {
        this.basket = new HashMap<>();
    }

    public void addProduct(String name, Product product) {
        if (basket.containsKey(name.toLowerCase())) {
            basket.get(name.toLowerCase()).add(product);
        } else {
            List<Product> products = new ArrayList<Product>();
            products.add(product);
            basket.put(name.toLowerCase(), products);
        }

    }

    public int totalCost() {
        return basket.values().stream().
                flatMap(Collection::stream)
                .mapToInt(Product::getPriceProduct).sum();
    }

    public void printBasket() {
        if (basket.isEmpty()) {
            System.out.println("Корзина пуста!");
            return;
        }

        basket.forEach((key, products) -> {
            if (products != null) {
                System.out.println(key + ": " + products);
            }
        });

        int totalCost = basket.values()
                .stream().flatMap(Collection::stream)
                .mapToInt(Product::getPriceProduct)
                .sum();


        int specialCount = getSpecialCount();

        System.out.println("Итого: " + totalCost);
        System.out.println("Специальных товаров: " + specialCount + "\n");
    }

    private int getSpecialCount() {
        return (int) basket.values()
                .stream()
                .flatMap(Collection::stream)
                .filter(Product::isSpecial)
                .count();
    }

    public boolean checkProductExist(String nameProduct) {
        return this.basket.containsKey(nameProduct.toLowerCase());
    }

    public void clearBasket() {
        basket.clear();
    }

    public List<Product> removeByName(String name) {
        List<Product> removedProducts = new LinkedList<>();
        if (basket.containsKey(name.toLowerCase())) {
            removedProducts.addAll(basket.get(name.toLowerCase()));
            basket.remove(name.toLowerCase());
        }
        return removedProducts;
    }
}
