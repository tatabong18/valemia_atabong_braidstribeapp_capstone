package com.BraidsTribeApplication.cart;

import com.BraidsTribeApplication.product.Product;

import java.util.List;

public interface CartService {
        List<Cart> getAllCarts();
        void saveCart(Cart cart);
        Cart getCartById();

        void addProductToCartById(Cart cart);

        Cart getCart();

        void deleteCart(Cart cart);

        Cart getCartById(long cartId);

        void addProductToCartById(Cart cart, long productId);
}
