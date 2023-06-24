package service;

import jakarta.annotation.Resource;
import model.Cart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface CartService {
        List<Cart> getAllCarts();
        void saveCart(Cart cart);
        Cart getCartById(long id);
        void deleteCartById(long id);
        void addProductToCartById(Cart cart, long productId);
}

