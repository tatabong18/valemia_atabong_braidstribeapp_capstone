package com.BraidsTribeApplication.service;

import com.BraidsTribeApplication.product.Product;
import com.BraidsTribeApplication.product.ProductNotFoundException;
import com.BraidsTribeApplication.product.ProductService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductServiceImplTest {
    @Autowired
    private ProductService productService;

    @BeforeEach
    void setUp() {
//        Product product1
//                = new Product("Green Braiding Hair");
//        productService.saveProduct(product1);
//        Product product2
//                = new Product("Purple Braiding Hair");
//        productService.saveProduct(product2);
//    }
//
//    @Test
//    void getAllProducts_should_return_all_products() {
//
//        List<Product> allProducts = productService.getAllProducts();
//        int beforeAddingMoreProducts = allProducts.size();
//
//        Product productsSaved
//                = new Product("Purple Braiding Hair");
//        productService.saveProduct(productsSaved);
//        int afterAddingMoreProducts = productService.getAllProducts().size();
//
//        Assertions.assertThat(afterAddingMoreProducts).isEqualTo(beforeAddingMoreProducts + 1);
//    }
//
//    @Test
//    void saveProduct_with_valid_data_should_save_it_successfully() {
//        double random = Math.random();
//        String randomName = "Green braiding Hair" + random;
//        String randomPrice = "Green braiding Hair" + random + "price";
//        Product product = new Product();
//
//       productService.saveProduct(product);
//
//        List<Product> allProducts = productService.getAllProducts();
//        Assertions.assertThat(allProducts.contains(product));
//    }
//
//    @Test
//    void getProductById_with_valid_id_should_return_valid_product() {
//        List<Product> allProducts = productService.getAllProducts();
//        Product product1 = allProducts.get(0);
//        if (product1 != null) {
//            Product product2 = productService.getProductById(product1.getId());
//            Assertions.assertThat(product1).isEqualTo(product2);
//        }
//    }
//
//    @ParameterizedTest
//    @ValueSource(ints = {1, 2}) // six numbers
//    void getProductById_with_parameterized_data(int id) {
//        Product product = productService.getProductById(id);
//        Assertions.assertThat(product.getId()).isEqualTo(id);
//    }
//
//    @Test
//    void _getProductById_with_invalid_id_should_throw_ProductNotFoundException() {
//        List<Product> allProducts = productService.getAllProducts();
//        int invalidProductId = allProducts.size() + 10;
//
//        // Using JUnit 5 assertion package
//        org.junit.jupiter.api.Assertions.assertThrows(
//                ProductNotFoundException.class,
//                () -> {
//                    productService.getProductById(invalidProductId);
//                });
//
//        // Using AssertJ assertion package
//        Assertions.assertThatThrownBy(() -> {
//            productService.getProductById(invalidProduct);
//        }).isInstanceOf(ProductNotFoundException.class);
    }
}

