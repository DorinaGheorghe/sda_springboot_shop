package com.sda.dorinagheorghe.webshop.repository;

import com.sda.dorinagheorghe.webshop.model.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

public interface AccountRepository extends CrudRepository<Account, Long> {

}
