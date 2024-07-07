package br.com.bareasy.service;

import br.com.bareasy.model.BarProduct;

import java.util.List;

public interface ProductService {
    List<BarProduct> getAllProducts();

    BarProduct getProductById(Long id);

    BarProduct createProduct(BarProduct product);

    BarProduct updateProduct(Long id, BarProduct productDetails);

    void inactiveProduct(Long id);
}
