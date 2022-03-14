package com.company;

import com.company.domain.Customer;
import com.company.service.CustomerService;

import java.util.List;

public class CompanyApplicationMain {

    public static void main(String[] args) {

        CustomerService customerService = new CustomerService();
        List<Customer> customers = customerService.getAllCustomers();

        Customer customer = new Customer(497, "Capgemini", "Badea", "Andreea", "+40703432201",
                "Splaiul Independentei", "Str. Manastirii",
                "Bucharest", null, "245800", "Romania", 1370, 25000);
        customerService.addCustomerToTable(customer);

    }

}
