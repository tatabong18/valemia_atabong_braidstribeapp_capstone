package cartItem;

import product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartItemServiceImpl implements CartItemService {
    private CartItemRepository cartItemRepository;

    @Autowired
    public CartItemServiceImpl(CartItemRepository cartItemRepository) {
        this.cartItemRepository = cartItemRepository;
    }

    @Override
    public List<CartItem> getAllCartItems() {
        return cartItemRepository.findAll();
    }

    @Override
    public void saveCartItem(CartItem cartItem) {
        cartItemRepository.save(cartItem);
    }

    @Override
    public CartItem getCartItemById(long id) {
        CartItem cartItem = cartItemRepository.getById(id);
        if(cartItem == null) {
            throw new CartItemNotFoundException();
        }
        return cartItem;
    }

    @Override
    public void deleteCartItemById(long id) {
        cartItemRepository.deleteById(id);
    }

    @Override
    public CartItem getNewCartItemFromProduct(Product product) {
        CartItem cartItem = new CartItem();
        cartItem.setProductId(product.getId());
        cartItem.setName(product.getName());
        cartItem.setPrice(product.getPrice());

        return cartItem;
    }
}
