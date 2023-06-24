package controller;

import model.Cart;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import service.CartService;
import service.ProductService;


@Controller
public class CartController {
    private CartService cartService;
    private ProductService menuItemService;

    @Autowired
    public CartController(CartService cartService,
                          productService productService
    ) {
        this.cartService = cartService;
        this.productService = productService;
    }

    @PostMapping("/addToCart/{product_id}")
    public String addToCart(
            @PathVariable(value = "Product_id") long productId,
            @ModelAttribute("cart") Cart cart,
            BindingResult bindingResult,
            Model model) {

        cartService.addProductToCartById(cart, productId);
        cartService.saveCart(cart);

        Logger logger = LoggerFactory.getLogger(CartController.class);
        logger.info("product with id " + productId + " has been added to cart");

      model.addAttribute("listProducts", productService.getAllProducts());
      model.addAttribute("cart", cart); // already in the model, but need to update the id?

        return "order";
    }

}