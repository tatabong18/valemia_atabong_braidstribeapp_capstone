package com.BraidsTribeApplication.product;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;



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
        Product menuItem = productRepository.getById(id);
        if(menuItem == null) {
            throw new ProductNotFoundException();
        }
        return menuItem;
    }

    @Override
    public void deleteProductById(long id) {
        productRepository.deleteById(id);

    }


}
