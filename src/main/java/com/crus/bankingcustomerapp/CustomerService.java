package com.crus.bankingcustomerapp;

import java.util.List;


public interface CustomerService {
    List<Customer> getAllCustomers();

    Customer getCustomerById(Long id);

    Customer createCustomer(Customer customer);

    Customer updateCustomer(Long id, Customer customer);

    String deleteCustomer(Long id);
}
