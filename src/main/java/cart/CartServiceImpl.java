package cart;

import org.springframework.stereotype.Service;
import product.Product;
import product.ProductNotFoundException;
import product.ProductRepository;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    private CartRepository cartRepository;
    private ProductRepository productRepository;

    public CartServiceImpl(CartRepository cartRepository, ProductRepository productRepository) {
        this.cartRepository = cartRepository;
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllCarts() {
        return cartRepository.findAll();
    }

    @Override
    public void saveCart(Cart cart) {
        cartRepository.save(cart);
    }

    @Override
    public Cart getCartById(long id) {
        return cartRepository.findById(id)
                .orElseThrow( new CartNotFoundException);
    }

    @Override
    public void deleteCartById(long id) {
        cartRepository.deleteById(id);
    }

    @Override
    public void addProductToCartById(Cart cart, long productId) {
        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new ProductNotFoundException);
        cart.addProduct(product);
        cartRepository.save(cart);
    }
}
