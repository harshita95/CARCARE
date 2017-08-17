package com.cdk.carcare.services;

import com.cdk.carcare.dao.CustomerDAO;
import com.cdk.carcare.model.Car;
import com.cdk.carcare.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerDAO customerDAO;

    @Transactional
    public int add(Customer customer) {
        //20 loc
        return customerDAO.save(customer);
    }

    @Transactional
    public int addCar(Car car, String email) {
        //20 loc
        Customer customer = customerDAO.selectByEmail(email);
        customer.getCars().add(car);
        return customerDAO.update(customer);
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
