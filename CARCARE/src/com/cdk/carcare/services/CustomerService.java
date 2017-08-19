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
        return customerDAO.save(customer);
    }



    //    @Transactional
//    public int modify(Customer customer){
//        return customerDAO.update(customer);
//    }
//
//
    @Transactional
    public Customer readByEmail(String email) {
        return customerDAO.selectByEmail(email);
    }

    @Transactional
    public Customer readById(int id) {
        return customerDAO.selectById(id);
    }

    public void authenticate(String email, String password) {
        customerDAO.selectByEmail(email);
    }

    public Customer checkEmail(String email, String password) {
        Customer customer = customerDAO.selectByEmail(email);
        if(customer.getPassword().equals(password)){
            return customer;
        }
        else{
            return null;
        }
    }
//
//    @Transactional
//    public List<Customer> readAll(){
//        return customerDAO.selectAll();
//
//    }
//
//    @Transactional
//    public void remove(int id) {
//        customerDAO.delete(id);
//    }

}
