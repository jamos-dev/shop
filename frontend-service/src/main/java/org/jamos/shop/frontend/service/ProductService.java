package org.jamos.shop.frontend.service;

import org.jamos.shop.frontend.model.Product;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    public List<Product> getProducts() {

        ArrayList<Product> products = new ArrayList<Product>();

        Product product = new Product();
        product.setId(1L);
        product.setName("aaa");
        product.setDescription("bbb");
        product.setPrice(new BigDecimal("100.50"));

        products.add(product);

        return products;

    }

}
