package com.sda.dorinagheorghe.webshop.service;

import com.sda.dorinagheorghe.webshop.model.Account;
import com.sda.dorinagheorghe.webshop.model.Customer;
import com.sda.dorinagheorghe.webshop.repository.AccountRepository;
import com.sda.dorinagheorghe.webshop.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class CustomerService {
    private final AccountRepository accountRepository;

    private final CustomerRepository customerRepository;

    // injected by Spring by constructor
    public CustomerService(AccountRepository accountRepository, CustomerRepository customerRepository) {
        this.accountRepository = accountRepository;
        this.customerRepository = customerRepository;
    }

    @Transactional
    public void addCustomer(Account account, Customer customer) {
        accountRepository.save(account);
        customerRepository.save(customer);

    }

    public Iterable<Account> getCustomerAccounts() {
        return accountRepository.findAll();
    }
}
