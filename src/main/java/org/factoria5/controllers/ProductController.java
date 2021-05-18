package org.factoria5.controllers;

import org.factoria5.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class ProductController {

    public List<Product> products = new ArrayList<>();

    @GetMapping("/products")
    public List<Product> allProducts() {
        return products;
    }

    @PostMapping("/products")
    private void addNewProduct(Product product) {
        products.add(product);
    }
}





