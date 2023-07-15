package com.BraidsTribeApplication.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllProducts() {

        return productRepository.findAll();
    }

    @Override
    public void saveProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public Product getProductById(long id) {
        return null;
    }

    @Override
    public void deleteProductById(long id) {

    }


}
