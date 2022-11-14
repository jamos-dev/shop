package org.jamos.shop.productservice.service;

import org.jamos.shop.productservice.model.Product;
import org.jamos.shop.productservice.repository.ProductsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {

    final ProductsRepository productsRepository;

    public ProductsService(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    public List<Product> getAll() {
        return productsRepository.findAll();
    }
}
