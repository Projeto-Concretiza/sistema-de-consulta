package com.concretiza.projeto.api;

import com.concretiza.projeto.model.Products.Product;
import com.concretiza.projeto.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class ProductResource {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/products")
    public List<Product> listAllProducts(){
        return productRepository.findAll();
    }

    @PostMapping("/products")
    public Product saveProduct(@RequestBody Product product){
        return productRepository.save(product);
    }

    @GetMapping("/products/name/{name}")
    public List<Product> listProductByName(@PathVariable(value = "name") String name){
        return productRepository.findByNameContaining(name);
    }

    @GetMapping("/products/brand/{brand}")
    public List<Product> listProductByBrand(@PathVariable(value = "brand") String brand){
            return productRepository.findByBrandContaining(brand);
    }

    @GetMapping("/products/category/{category}")
    public List<Product> listProductByCategory(@PathVariable(value = "category") String category){
            return productRepository.findByCategoryContaining(category);
    }
    
}
