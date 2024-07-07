package br.com.bareasy.controller;

import br.com.bareasy.model.BarProduct;
import br.com.bareasy.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
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
        BarProduct build = new BarProduct().builder()
                .active(true)
                .price(new BigDecimal("100.00"))
                .description("Banana prata")
                .name("Banana")
                .build();

        return productService.createProduct(build);
    }

    // Endpoint para atualizar um produto existente
    @PutMapping("/{id}")
    public BarProduct updateProduct(@PathVariable Long id, @RequestBody BarProduct productDetails) {
        return productService.updateProduct(id, productDetails);
    }

    // Endpoint para excluir um produto
    @DeleteMapping("/{id}")
    public void inactiveProduct(@PathVariable Long id) {
        productService.inactiveProduct(id);
    }
}

