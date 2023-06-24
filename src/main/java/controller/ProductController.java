package controller;

import model.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import service.ProductService;

import java.awt.*;
@Controller
public class ProductController {
        private ProductService productService;

        @Autowired
        public ProductController(ProductService productService) {
            this.productService = productService;
        }

        @GetMapping("/product")
        public String getAll(Model model) {
            model.addAttribute("listProductss", productService.getAllProducts());
            return "menu";
        }

        @GetMapping("/showNewProductForm")
        public String showNewForm(Model model) {
            // create model attribute to bind form data
            Product product = new Product();
            model.addAttribute("product", product);
            return "new_product";
        }

        @PostMapping("/saveProduct")
        public String save(@ModelAttribute("product") Product product) {
            // save menuItem to database
            productService.saveProduct(product);

            Logger logger = LoggerFactory.getLogger(ProductController.class);

            logger.info("Product " + product.getName()
                    + " has been saved to product");

            return "redirect:/product";
        }

        @GetMapping("/showProductFormForUpdate/{id}")
        public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {
            // get product from the service
            Product product = productService.getProductById(id);

            // set product as a model attribute to pre-populate the form
            model.addAttribute("product", product);
            return "update_product";
        }

        @GetMapping("/deleteProduct/{id}")
        public String delete(@PathVariable(value = "id") long id) {
            // call delete product method
            this.productService.deleteProductById(id);
            return "redirect:/product";
        }
    }
