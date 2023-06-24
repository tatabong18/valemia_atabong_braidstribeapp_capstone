package service;

import model.Cart;
import model.CartItem;
import model.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CartRepository;
import java.util.List;



@Service
public class CartServiceImpl implements CartService {
    private CartRepository cartRepository;
    private ProductService productService;
    private CartItemService cartItemService;

    @Autowired
    public CartServiceImpl(CartRepository cartRepository, CartItemService cartItemService, CartItemService cartItemService) {
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
    public Cart getCartById(long id) {
        Cart cart = cartRepository.getById(id);
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
    public void addProductToCartById(Cart cart, long productId) {

    }

    @Override
    public void addProductToCartById(Cart cart, long productId) {
        Product cartItem = cartItemService.getCartItemById(productId);

        CartItem cartItem = cartItemService.getNewCartItemFromCartItem(cartItem);

        cart.addCartItemToCart(cartItem);

        cartItemService.saveCartItem(cartItem);

        Logger logger = LoggerFactory.getLogger(CartServiceImpl.class);
        logger.info("CartServiceImpl: Product with id " + productId + " has been added to cart with id " + cart.getId());
    }
}