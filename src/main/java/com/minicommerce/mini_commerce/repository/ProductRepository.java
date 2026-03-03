package com.minicommerce.mini_commerce.repository;

import com.minicommerce.mini_commerce.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
