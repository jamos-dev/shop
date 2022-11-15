package org.jamos.shop.frontend.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
public class Product {

    private Long id;
    private String name;
    private String description;
    private BigDecimal price;

}
