package configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import product.ProductRepository;
import product.ProductService;
import product.ProductServiceImpl;

@Configuration
public class AppConfiguration {

    @Bean
    @Autowired
    public ProductService productService(ProductRepository productRepository) {
        return new ProductServiceImpl(productRepository);
    }
}