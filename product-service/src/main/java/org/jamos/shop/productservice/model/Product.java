package org.jamos.shop.productservice.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
@Entity
@Table
public class Product {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    private String description;

    @Column(precision = 10, scale = 2)
    private BigDecimal price;

}
