package com.sda.dorinagheorghe.webshop.repository;

import com.sda.dorinagheorghe.webshop.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
