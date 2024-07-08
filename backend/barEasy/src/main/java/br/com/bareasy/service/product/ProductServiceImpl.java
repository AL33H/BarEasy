package br.com.bareasy.service.product;

import br.com.bareasy.model.BarProduct;
import br.com.bareasy.repository.ProductRepository;
import br.com.bareasy.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<BarProduct> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public BarProduct getProductById(Long id) {
        return productRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Product not found"));
    }

    @Override
    public BarProduct createProduct(BarProduct product) {
        return productRepository.save(product);
    }

    @Override
    public BarProduct updateProduct(BarProduct productDetails) {
        return productRepository.save(productDetails);
    }

    @Override
    public void inactiveProduct(Long id) {
        BarProduct product = productRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Product not found with id " + id));

        product.inactiveProduct();

        productRepository.save(product);
    }
}
