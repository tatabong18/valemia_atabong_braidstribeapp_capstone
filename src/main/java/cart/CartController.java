package cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import product.Product;
import product.ProductRepository;
//import user.User;
//import user.UserRepository;

@Controller
@RequestMapping("/cart")
public class CartController {

    private final CartRepository cartRepository;
    private final ProductRepository productRepository;
    private final UserRepository userRepository;

    @Autowired
    public CartController(CartRepository cartRepository, ProductRepository productRepository, UserRepository userRepository) {
        this.cartRepository = cartRepository;
        this.productRepository = productRepository;
        this.userRepository = userRepository;
    }

    @GetMapping("/{userId}")
    public String viewCart(@PathVariable("userId") int userId, Model model) {
        User user = userRepository.findById(userId).orElseThrow(() -> new IllegalArgumentException("Invalid user id"));
        Cart cart = cartRepository.findByUser(user);
        model.addAttribute("cart", cart);
        return "cart/view";
    }

    @PostMapping("/{userId}/add")
    public String addToCart(@PathVariable("userId") int userId, @RequestParam("productId") int productId) {
        User user = userRepository.findById(userId).orElseThrow(() -> new IllegalArgumentException("Invalid user id"));
        Product product = productRepository.findById(productId).orElseThrow(() -> new IllegalArgumentException("Invalid product id"));
        Cart cart = cartRepository.findByUser(user);

        if (cart == null) {
            cart = new Cart();
            cart.setUser(user);
        }

        cart.addProduct(product);
        cartRepository.save(cart);

        return "redirect:/cart/" + userId;
    }

    @PostMapping("/{userId}/remove")
    public String removeFromCart(@PathVariable("userId") int userId, @RequestParam("productId") int productId) {
        User user = userRepository.findById(userId).orElseThrow(() -> new IllegalArgumentException("Invalid user id"));
        Cart cart = cartRepository.findByUser(user);

        if (cart != null) {
            Product product = productRepository.findById(productId).orElseThrow(() -> new IllegalArgumentException("Invalid product id"));
            cart.removeProduct(product);
            cartRepository.save(cart);
        }

        return "redirect:/cart/" + userId;
    }
}
