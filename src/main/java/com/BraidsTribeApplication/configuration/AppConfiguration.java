package com.BraidsTribeApplication.configuration;

import com.BraidsTribeApplication.product.ProductRepository;
import com.BraidsTribeApplication.product.ProductService;
import com.BraidsTribeApplication.product.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean
    @Autowired
    public ProductService productService(ProductRepository productRepository) {
        return new ProductServiceImpl(productRepository);
    }
}