package org.jamos.shop.productservice.repository;

import org.jamos.shop.productservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product, Long> {
}
