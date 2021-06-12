//package com.sda.dorinagheorghe.webshop;
//
//import com.sda.dorinagheorghe.webshop.model.Account;
//import com.sda.dorinagheorghe.webshop.model.Customer;
//import com.sda.dorinagheorghe.webshop.model.Product;
//import com.sda.dorinagheorghe.webshop.model.ProductCategory;
//import com.sda.dorinagheorghe.webshop.repository.AccountRepository;
//import com.sda.dorinagheorghe.webshop.service.CustomerService;
//import com.sda.dorinagheorghe.webshop.service.MailService;
//import com.sda.dorinagheorghe.webshop.service.OrderService;
//import com.sda.dorinagheorghe.webshop.service.ProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import java.lang.reflect.Array;
//import java.util.Arrays;
//
//@SpringBootApplication
//@EnableTransactionManagement
//@EnableJpaRepositories(basePackages = "com.sda.dorinagheorghe.webshop.repository")
//@EntityScan(basePackages = "com.sda.dorinagheorghe.webshop.model")
//public class WebshopApplication implements CommandLineRunner {
//
//    @Autowired
//    private CustomerService customerService;
//    @Autowired
//    private MailService mailService;
//    @Autowired
//    private AccountRepository accountRepository;
//    @Autowired
//    private ProductService productService;
//    @Autowired
//    private OrderService orderService;
//
//    public static void main(String[] args) {
//
//        SpringApplication.run(WebshopApplication.class, args);
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//        context.refresh();
//
//        // here we have the context and we can start the code/put here your code
//        Account account1 = new Account();
//        account1.setId(1L);
//
//        Customer customer1 = new Customer();
//        customer1.setId(1L);
//
//        customerService.addCustomer(account1, customer1);
//
//        customerService.getCustomerAccounts().forEach(account -> System.out.println(account.toString())); //sau method reference in lambda customerService.getCustomerAccounts().forEach(System.out::println), este recom cand var din stg si dr este aceeasi ->account
//
////        mailService.sendMail("dorina.gheorghe393@gmail.com",
////                "dorinutg@gmail.com",
////                "test/mock mail subject",
////                "hello/mock mail content");
//
//        accountRepository.findAllByIsClosed(false).forEach(System.out::println);
//        accountRepository.findAllByBillingAddressContaining("Hu").forEach(System.out::println);
//
//        Product product1 = new Product("icecream", "ice cream", 1.50, "EUR", ProductCategory.PET_FOOD);
//        productService.save(product1);
//        productService.findAll().forEach(product -> System.out.println(product));
//
//        orderService.save(customer1, Arrays.asList(product1));
//    }
//}
