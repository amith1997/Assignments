package com.assignments;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<String> items;
    
    public ShoppingCart() {
        items = new ArrayList<>();
    }
    
    public void addItem(String item) {
        items.add(item);
    }
    
    public void emptyCart() {
        items.clear();
    }
    
    public List<String> viewCart() {
        return new ArrayList<>(items);
    }
    
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Apple");
        cart.addItem("Banana");
        System.out.println("Cart before emptying: " + cart.viewCart());
        cart.emptyCart();
        System.out.println("Cart after emptying: " + cart.viewCart());
    }
}