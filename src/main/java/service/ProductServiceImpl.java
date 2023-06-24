package service;
import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import repository.ProductRepository;

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
        return null;
    }

    @Override
    public Product getProductById(long id) {
        Product product = productRepository.getById(id);
        if(product == null) {
            throw new ProductNotFoundException();
        }
        return product;
    }

    @Override
    public void deleteProductById(long id) {
        productRepository.deleteById(id);
    }
}