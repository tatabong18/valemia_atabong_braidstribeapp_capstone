package com.BraidsTribeApplication.frontend;

import com.BraidsTribeApplication.product.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontendController {

//    @GetMapping("/")
//    public String index(Model model) {
//        return "index";
//    }

    @GetMapping("/checkout")
    public String checkout(Model model) {
        return "checkout";
    }

    @GetMapping("/aboutUs")
    public String aboutUs(Model model) {
        return "about-Us";
    }

    @GetMapping("/account")
    public String account(Model model) {
        return "account";
    }
}
