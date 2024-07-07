package br.com.bareasy;

import br.com.bareasy.model.BarProduct;
import br.com.bareasy.model.BarTable;
import br.com.bareasy.model.enums.TableStatusEnum;
import br.com.bareasy.repository.ProductRepository;
import br.com.bareasy.repository.TableRepository;
import br.com.bareasy.service.ProductService;
import br.com.bareasy.service.TableServiceImpl;
import br.com.bareasy.service.product.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class BarEasyApplication {

    public static void main(String[] args) {
        SpringApplication.run(BarEasyApplication.class, args);
    }

}
