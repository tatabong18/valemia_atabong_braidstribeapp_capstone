package cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import product.ProductService;

@Controller
public class CartController {
    private CartService cartService;
    private ProductService productService;

    @Autowired
    public CartController(CartService cartService, ProductService productService
    ) {
        this.cartService = cartService;
        this.productService = productService;
    }

    @PostMapping("/addToCart/{product_id}")
    public String addToCart(
            @PathVariable(value = "product_id") long productId,
            @ModelAttribute("cart") Cart cart,
            BindingResult bindingResult,
            Model model) {

        cartService.addProductToCartById(cart, productId);
        cartService.saveCart(cart);

//        Logger logger = LoggerFactory.getLogger(CartController.class);
//        logger.info("Product with id " + productId + " has been added to cart");

        model.addAttribute("listProducts", productService.getAllProducts());
        model.addAttribute("cart", cart); // already in the model, but need to update the id?

        return "order";
    }
}