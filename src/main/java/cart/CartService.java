package cart;

import java.util.List;

public interface CartService {
        List<Cart> getAllCarts();
        void saveCart(Cart cart);
        Cart getCartById(long id) throws CartNotFoundException;
        void deleteCartById(long id);
        void addProductToCartById(Cart cart, long productId);
}

