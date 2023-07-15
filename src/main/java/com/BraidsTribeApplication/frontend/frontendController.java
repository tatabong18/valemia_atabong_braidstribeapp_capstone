package com.BraidsTribeApplication.frontend;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class frontendController {
    @Controller
    public class AboutUsController {
        @GetMapping("/aboutUs")
        public String aboutUs(Model model) {
            return "about-Us";
        }

        @GetMapping("/product")
        public String product(Model model) {
            return "product";
        }

        @GetMapping("/")
        public String index(Model model) {
            return "index";
        }

        @GetMapping("/checkout")
        public String checkout(Model model) {
            return "checkout";
        }


        @GetMapping("/account")
        public String account(Model model) {
            return "account";
        }
    }
}
