package com.minicommerce.mini_commerce.domain;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table (name = "products")

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private BigDecimal precio;

    @Column(nullable = false)
    private Integer stock;

    public Product(){
    }

    public Long getid() {return id; }
    public void setId() {this.id = id; }

    public String getName() {return name; }
    public void setName() {this.name = name; }

    public BigDecimal getPrecio() {return precio;}
    public void setPrecio() {this.precio = precio; }

    public Integer getStock() {return stock;}
    public void setStock() {this.stock = stock;}


}