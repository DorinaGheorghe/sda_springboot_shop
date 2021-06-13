package com.sda.dorinagheorghe.webshop.controller;

import com.sda.dorinagheorghe.webshop.error.ResourceNotFoundException;
import com.sda.dorinagheorghe.webshop.model.Product;
import com.sda.dorinagheorghe.webshop.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.findAll();
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable(value = "id") Long productId) throws ResourceNotFoundException {
        Optional<Product> product = productService.findById(productId);
        if (product.isPresent()) {
            return ResponseEntity.ok(product.get());
        }
        throw new ResourceNotFoundException("product with id:" + productId + "was not found");
    }

    @PostMapping("/products")
    public String createproduct(@Valid @RequestBody Product product) {
        productService.save(product);
        return "Product saved";
    }
}
