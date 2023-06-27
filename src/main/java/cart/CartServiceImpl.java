package cart;

import cartItem.CartItem;
import product.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cartItem.CartItemService;
import product.ProductService;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    private CartRepository cartRepository;
    private ProductService productService;
    private CartItemService cartItemService;

    @Autowired
    public CartServiceImpl(CartRepository cartRepository, ProductService productService, CartItemService cartItemService) {
        this.cartRepository = cartRepository;
        this.productService = productService;
        this.cartItemService = cartItemService;
    }

    @Override
    public List<Cart> getAllCarts() {
        return cartRepository.findAll();
    }

    @Override
    public void saveCart(Cart cart) {
        cartRepository.save(cart);
    }

    @Override
    public Cart getCartById(long id) throws CartNotFoundException {
        Cart cart = cartRepository.getById(id);
        if(cart == null) throw new CartNotFoundException();
        return cart;
    }

    @Override
    public void deleteCartById(long id) {
        cartRepository.deleteById(id);
    }

    @Override
    public void addProductToCartById(Cart cart, long Id) {
        Product product = productService.getProductById(Id);

        CartItem cartItem = cartItemService.getNewCartItemFromProduct(product);

        cart.addCartItemToCart(cartItem);

        cartItemService.saveCartItem(cartItem);

        Logger logger = LoggerFactory.getLogger(CartServiceImpl.class);
        logger.info("CartServiceImpl: Product id " + product.getId() + " has been added to cart with id " + cart.getId());
    }
}