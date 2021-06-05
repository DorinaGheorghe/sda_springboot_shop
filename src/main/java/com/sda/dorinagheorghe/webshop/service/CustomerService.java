package com.sda.dorinagheorghe.webshop.service;

import com.sda.dorinagheorghe.webshop.model.Account;
import com.sda.dorinagheorghe.webshop.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private final AccountRepository accountRepository;

    // injected by Spring by constructor
    public CustomerService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public void addCustomer(Account account) {
        accountRepository.save(account);
    }

    public List<Account> getCustomerAccounts() {
        return accountRepository.getAll();
    }
}
