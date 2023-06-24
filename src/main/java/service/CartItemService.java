package service;
import model.CartItem;

import java.awt.*;
import java.util.List;

public interface CartItemService {
    default List<CartItem> getAllCartItems() {
        return null;
    }

    void saveCartItem(CartItem cartItem);
    CartItem getCartItemById(long id);
    void deleteCartItemById(long id);
    CartItem getNewCartItemFromMenuItem(MenuItem menuItem);
}