package cart;

import order.Order;

import java.util.List;

public interface CartService {
        List<Order> getAllCarts();
        void saveCart(Order order);
        Order getCartById(long id) throws CartNotFoundException;
        void deleteCartById(long id);
        void addProductToCartById(Order order, long productId);
}

