package com.service;

import com.store.Product;

import java.util.List;

public interface StoreService {
    List<Product> addProduct(Product product);

    List<Product> deleteProduct(int id);

    List<Product> editProduct(Product product);
}
