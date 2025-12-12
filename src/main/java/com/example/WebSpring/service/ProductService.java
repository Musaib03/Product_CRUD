package com.example.WebSpring.service;

import com.example.WebSpring.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(1011, "Laptop", 45000),
            new Product(1012, "Smartphone", 25000),
            new Product(1013, "Tablet", 15000)));

    public List<Product> getAllProducts() {
        return products;
    }

    public Optional<Product> getProductById(int id) {
        return products.stream()
                .filter(p -> p.getId() == id)
                .findFirst();
    }

    public Product addProduct(Product product) {
        products.add(product);
        return product;
    }

    public Optional<Product> updateProduct(int id, Product updatedProduct) {
        return products.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .map(p -> {
                    p.setName(updatedProduct.getName());
                    p.setPrice(updatedProduct.getPrice());
                    return p;
                });
    }

    public boolean deleteProduct(int id) {
        return products.removeIf(p -> p.getId() == id);
    }
}
