package com.BraidsTribeApplication.cart;

import com.BraidsTribeApplication.product.ProductRepository;
import com.BraidsTribeApplication.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public List<Cart> getAllCarts() {
        return null;
    }

    @Override
    public void saveCart(Cart cart) {
        cartRepository.save(cart);
    }

    @Override
    public Cart getCartById() {
        return null;
    }

    @Override
    public void addProductToCartById(Cart cart) {

    }
    @Override
    public Cart getCart() {
        return null;
    }

    @Override
    public void deleteCart(Cart cart) {

    }

    @Override
    public Cart getCartById(long cartId) {
        return null;
    }

    @Override
    public void addProductToCartById(Cart cart, long productId) {

    }
}
