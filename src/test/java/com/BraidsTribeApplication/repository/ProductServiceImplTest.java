package com.BraidsTribeApplication.repository;

import com.BraidsTribeApplication.product.Product;
import com.BraidsTribeApplication.product.ProductRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductServiceImplTest {
    @Autowired
    private ProductRepository productRepository;
    @BeforeEach
    void setUp() {
        Product product = new Product();
        product.setName("Green Braiding Hair");
        product.setPrice(20.00);
        productRepository.save(product);
    }

//    @Test
//    void findProductByName_should_return_Product_given_valid_name() {
//
//        Product hair = productRepository.findProductByName("Green Braiding Hair");
//        Assertions.assertThat(hair.getName()).isEqualTo("Green Braiding Hair");
//    }
}
