package org.jamos.shop.frontend.controller;

import org.jamos.shop.frontend.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final ProductService productService;

    public HomeController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    public String index(Model model) {

        var products = productService.getProducts();
        model.addAttribute("products", products);

        return "index";
    }

}
