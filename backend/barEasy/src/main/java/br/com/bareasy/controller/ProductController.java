package br.com.bareasy.controller;

import br.com.bareasy.model.BarProduct;
import br.com.bareasy.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("v1/product")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping
    public List<BarProduct> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public BarProduct getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    @PostMapping
    public BarProduct createProduct(@RequestBody BarProduct product) {
        return productService.createProduct(product);
    }

    @PutMapping("/{id}")
    public BarProduct updateProduct(@RequestBody BarProduct productDetails) {
        return productService.updateProduct(productDetails);
    }

    @DeleteMapping("/{id}")
    public void inactiveProduct(@PathVariable Long id) {
        productService.inactiveProduct(id);
    }
}

