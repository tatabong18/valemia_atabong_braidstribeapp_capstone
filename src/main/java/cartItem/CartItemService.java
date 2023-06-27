package cartItem;
import product.Product;

import java.util.List;


public interface CartItemService {
    List<CartItem> getAllCartItems();
    void saveCartItem(CartItem cartItem);
    CartItem getCartItemById(long id);
    void deleteCartItemById(long id);
    CartItem getNewCartItemFromProduct(Product product);
}