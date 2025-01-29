package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.*;

public class ProductBasket {
    private final List<Product> basket;

    public ProductBasket(int size) {
        this.basket = new LinkedList<Product>();
    }

    public void addProduct(Product product) {
        basket.add(product);
    }

    public int totalCost() {
        int cost = 0;
        for (Product pd : this.basket) {
            if (pd != null) {
                cost += pd.getPriceProduct();
            }
        }
        return cost;
    }

    public void printBasket() {
        int specialCount = 0;
        boolean isEmpty = false;
        int cost = 0;
        for (Product pd : this.basket) {
            if (pd != null) {
                if (pd.isSpecial()) {
                    specialCount ++;
                }
                isEmpty = true;
                System.out.println(pd);
                cost += pd.getPriceProduct();
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
        for (Product pd : this.basket) {
            if (pd != null && Objects.equals(pd.getProductName(), nameProduct)) {
                return true;
            }
        }
        return false;
    }

    public void clearBasket() {
        basket.clear();
    }
}
