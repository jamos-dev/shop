package org.jamos.shop.productservice.controller;

import org.jamos.shop.productservice.model.Product;
import org.jamos.shop.productservice.service.ProductsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "product")
public class ProductsController {

    private final ProductsService productsService;

    public ProductsController(ProductsService productsService) {
        this.productsService = productsService;
    }

    @GetMapping
    public ResponseEntity<List<Product>> list() {
        var products = productsService.getAll();
        return ResponseEntity.ok(products);
    }
}
