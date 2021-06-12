package com.sda.dorinagheorghe.webshop.repository;

import com.sda.dorinagheorghe.webshop.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
