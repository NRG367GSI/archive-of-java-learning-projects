package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.Arrays;
import java.util.Objects;

public class ProductBasket {
    private final Product[] basket;

    public ProductBasket(int size) {
        this.basket = new Product[size];
    }

    public void addProduct(Product product) {
        for (int i = 0; i < this.basket.length; i++) {
            if (this.basket[i] == null) {
                this.basket[i] = product;
                return;
            }
        }
        System.out.println("Не возможно добавить продукт!");
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
        boolean isEmpty = false;
        int cost = 0;
        for (Product pd : this.basket) {
            if (pd != null) {
                isEmpty = true;
                System.out.println(pd);
                cost += pd.getPriceProduct();
            }
        }
        if (isEmpty) {
            System.out.println("Итого: " + cost);
        } else {
            System.out.println("Корзина пуста!");
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
        Arrays.fill(this.basket, null);
    }
}
