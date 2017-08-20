package com.cdk.carcare.services;

import com.cdk.carcare.dao.CustomerDAO;
import com.cdk.carcare.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerService {

    @Autowired
    CustomerDAO customerDAO;

    @Transactional
    public int add(Customer customer) {
        //20 loc
        if (customerDAO.selectByEmail(customer.getEmail()) == null)
            return customerDAO.save(customer);
        else
            return -1;
    }

    @Transactional
    public Customer readByEmail(String email) {
        return customerDAO.selectByEmail(email);
    }

    @Transactional
    public Customer readById(int id) {
        return customerDAO.selectById(id);
    }

    public Customer checkEmail(String email, String password) {
        Customer customer = customerDAO.selectByEmail(email);
        if (customer != null && (customer.getPassword().equals(password))) {
            return customer;
        } else {
            return null;
        }
    }

    public void setCustomerDAO(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

}
