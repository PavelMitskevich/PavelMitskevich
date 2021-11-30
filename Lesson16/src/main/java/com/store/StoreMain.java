package com.store;

import com.service.StoreService;
import com.service.StoreServiceImpl;

import java.util.Comparator;

public class StoreMain {
    public static void main(String[] args) {
        Store store = new Store();
        StoreService storeService = new StoreServiceImpl(store);

        Product apple = new Product(100, "apple", 15);
        Product apple1 = new Product(101, "apple1", 13);
        Product apple2 = new Product(102, "apple2", 12);
        Product apple3 = new Product(103, "apple3", 11);

        storeService.addProduct(apple);
        storeService.addProduct(apple1);
        storeService.addProduct(apple2);
        storeService.addProduct(apple3);
        storeService.addProduct(apple1);
        System.out.println(store.getProducts());

        storeService.deleteProduct(102);
        System.out.println(store.getProducts());

        storeService.editProduct(new Product(101, "strawberry", 22));
        System.out.println(store.getProducts());

        store.getProducts().sort(Comparator.comparingInt(Product::getPrice));
        System.out.println(store.getProducts());

    }
}
