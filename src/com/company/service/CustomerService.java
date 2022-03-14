package com.company.service;

import com.company.domain.Customer;
import com.company.exceptions.AccessDatabaseException;
import com.company.exceptions.DeleteValueException;
import com.company.exceptions.InsertValueException;
import com.company.repository.CustomerRepository;
import org.tinylog.Logger;

import java.util.List;


public class CustomerService {

    CustomerRepository customerRepository = new CustomerRepository();

    public List<Customer> getAllCustomers(){
        try {
            return customerRepository.getAll();
        } catch (AccessDatabaseException e) {
            Logger.error("Could not access database.");
        }
        return null;
    }

    public void addCustomerToTable(Customer customer) {
        try {
            customerRepository.addToTable(customer);
            Logger.info("Customer id {} added to database.", customer.getCustomerNumber());
        } catch (InsertValueException e) {
            Logger.error("Could not insert customer in the database.");
        }
    }
    public void deleteCustomerById(int id)  {
        try {
            customerRepository.deleteById(id);
            Logger.info("Customer id {} deleted from database. ", id);
        } catch (DeleteValueException e) {
            Logger.error("Could not delete customer from the database.");
        }
    }


    }






