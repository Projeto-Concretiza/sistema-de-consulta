package com.concretiza.projeto.repository;

import com.concretiza.projeto.model.Products.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, String> {

    List<Product> findByNameContaining(String name);

    List<Product> findByBrandContaining(String brand);

    List<Product> findByCategoryContaining(String category);
}
