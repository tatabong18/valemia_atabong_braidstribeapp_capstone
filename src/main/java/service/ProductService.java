package service;

import model.Product;
import java.awt.*;
import java.util.List;


public interface ProductService {
        List<Product> getAllProducts();
        void saveProduct(Product product);
        Product getProductById(long id);
        void deleteProductById(long id);
    }
