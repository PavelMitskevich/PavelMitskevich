package com.store;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private final List<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return products;
    }
}
