package com.sda.dorinagheorghe.webshop.repository;

import com.sda.dorinagheorghe.webshop.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
