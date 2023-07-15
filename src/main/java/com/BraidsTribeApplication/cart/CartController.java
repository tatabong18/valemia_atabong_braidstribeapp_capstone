package com.BraidsTribeApplication.cart;

import com.BraidsTribeApplication.product.Product;
import com.BraidsTribeApplication.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CartController {

    private CartService cartService;
    private ProductService productService;

    @Autowired
    public CartController(CartService cartService, ProductService productService) {
        this.cartService = cartService;
        this.productService = productService;
    }

    @GetMapping("/cart")
    public String getCart(Model model) {
        Cart cart = cartService.getCart();
        model.addAttribute("cart", cart);
        return "cart";
    }
    @PostMapping("/addToCart/{product_id}")
    public String addToCart(@PathVariable("product_id") long productId, Model model) {
        // Add the product to the cart logic
        Cart cart = cartService.getCart(); // Get the cart object
        Product product = productService.getProductById(productId); // Get the product by ID
        if (product != null) {
            cart.addProduct(product); // Add the product to the cart
            cartService.saveCart(cart); // Save the updated cart
            //  success message
            model.addAttribute("message", "Product added to cart successfully");
        } else {
            // error message
            model.addAttribute("error", "Product not found");
        }

        return "redirect:/cart"; // Redirect to the cart page after adding the product
    }
//
//    @GetMapping("/cart/removeProduct/{productId}")
//    public String removeProductFromCart(@PathVariable("productId") long productId) {
//        Cart cart = cartService.getCart();
//        Product productToRemove = cart.getProducts().stream()
//                .filter(product -> product.getId() == productId)
//                .findFirst()
//                .orElseThrow();
//        cart.removeProduct(productToRemove);
//        cartService.saveCart(cart);
//        return "redirect:/cart";
//    }

    @GetMapping("/cart/delete")
    public String deleteCart() {
        Cart cart = cartService.getCart();
        cartService.deleteCart(cart);
        return "redirect:/cart";
    }
}
