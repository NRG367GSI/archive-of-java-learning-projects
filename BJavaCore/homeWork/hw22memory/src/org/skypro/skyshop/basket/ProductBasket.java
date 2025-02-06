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
        int total = 0;
        for (Map.Entry<String, List<Product>> entry : this.basket.entrySet())
            total += entry.getValue().iterator().next().getPriceProduct();
        return total;
    }

    public void printBasket() {
        int specialCount = 0;
        boolean isEmpty = false;
        int cost = 0;
        for (Map.Entry<String, List<Product>> entry : this.basket.entrySet()) {
            if (entry != null && entry.getValue() != null) {
                for (Product product : entry.getValue())
                    if (product.isSpecial()) {
                        specialCount ++;
                }
                isEmpty = true;
                System.out.println(entry);
                cost += entry.getValue().iterator()
                        .next()
                        .getPriceProduct();
            }
        }
        if (isEmpty) {
            System.out.println("Итого: " + cost);
            System.out.println("Специальных товаров: " + specialCount + "\n");
        } else {
            System.out.println("Корзина пуста!\n");
        }
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
