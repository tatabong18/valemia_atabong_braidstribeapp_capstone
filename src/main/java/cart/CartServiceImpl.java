package cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import product.Product;
import product.ProductRepository;
import product.ProductService;

import java.awt.*;
import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    private CartRepository cartRepository;
    @Autowired
    private ProductService productService;
    @Autowired
    private ProductRepository productRepository;

    public CartServiceImpl(CartRepository cartRepository, ProductService productService, ProductRepository productRepository) {
        this.cartRepository = cartRepository;
        this.productService = productService;
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllCarts() {
        return cartRepository.findAll();
    }

    @Override
    public void saveCart(Cart cart) {
        cartRepository.save();
    }

    @Override
    public Product getCartById(long id) {
        Product cart = cartRepository.getById(id);
        if(cart == null) {
            throw new CartNotFoundException();
        }
        return cart;
    }


    @Override
    public void deleteCartById(long id) {
        cartRepository.deleteById(id);
    }

    @Override
    public void addProductToCartById(Cart cart, long id) {
        Product product = productRepository.findById(id)
                .orElseThrow();
        cart.addProduct(product);
        cartRepository.save(product);
    }
}
