package com.service;

import com.store.Product;
import com.store.Store;

import java.util.Comparator;
import java.util.List;

public class StoreServiceImpl implements StoreService, Comparator<Product> {
    private final Store store;

    public StoreServiceImpl(Store store) {
        this.store = store;
    }

    @Override
    public List<Product> addProduct(Product product) {
        if (store.getProducts().size() == 0) {
            store.getProducts().add(product);
        } else {
            for (int i = 0; i < store.getProducts().size(); i++) {
                if (product.getId() == store.getProducts().get(i).getId()) {
                    return store.getProducts();
                }
            }
            store.getProducts().add(product);
        }
        return store.getProducts();
    }

    @Override
    public List<Product> deleteProduct(int id) {
        for (int i = 0; i < store.getProducts().size(); i++) {
            if (id == store.getProducts().get(i).getId()) {
                store.getProducts().remove(i);
                return store.getProducts();
            }
        }
        return store.getProducts();
    }

    @Override
    public List<Product> editProduct(Product product) {
        for (int i = 0; i < store.getProducts().size(); i++) {
            if (product.getId() == store.getProducts().get(i).getId()) {
                store.getProducts().get(i).setName(product.getName());
                store.getProducts().get(i).setPrice(product.getPrice());
                return store.getProducts();
            }
        }
        return store.getProducts();
    }

    @Override
    public int compare(Product o1, Product o2) {
        return Integer.compare(o1.getPrice(), o2.getPrice());
    }
}
