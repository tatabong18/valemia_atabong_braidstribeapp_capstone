package cart;

import product.Product;

import java.util.List;

public interface CartService {
        List<Product> getAllCarts();
        void saveCart(Cart cart);
        Cart getCartById(long id);
        void deleteCartById(long id);
        void addProductToCartById(Cart cart, long productId);

}
