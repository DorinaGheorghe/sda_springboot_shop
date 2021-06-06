package com.sda.dorinagheorghe.webshop;

import com.sda.dorinagheorghe.webshop.model.Account;
import com.sda.dorinagheorghe.webshop.model.Customer;
import com.sda.dorinagheorghe.webshop.repository.AccountRepository;
import com.sda.dorinagheorghe.webshop.service.CustomerService;
import com.sda.dorinagheorghe.webshop.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.sda.dorinagheorghe.webshop.repository")
@EntityScan(basePackages ="com.sda.dorinagheorghe.webshop.model" )
public class WebshopApplication implements CommandLineRunner {

    @Autowired
    private CustomerService customerService;
    @Autowired
    private MailService mailService;
    @Autowired
    private AccountRepository accountRepository;

    public static void main(String[] args) {

        SpringApplication.run(WebshopApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.refresh();

        // here we have the context and we can start the code/put here your code
        Account account1 = new Account();
        account1.setId(1L);

        Customer customer = new Customer();
        customer.setId(1L);

        customerService.addCustomer(account1, customer);

        customerService.getCustomerAccounts().forEach(account -> System.out.println(account.toString())); //sau method reference in lambda customerService.getCustomerAccounts().forEach(System.out::println), este recom cand var din stg si dr este aceeasi ->account

        mailService.sendMail("dorina.gheorghe393@gmail.com",
                "dorinutg@gmail.com",
                "test",
                "hello");

        accountRepository.findAllByIsClosed(false).forEach(System.out::println);



    }
}
