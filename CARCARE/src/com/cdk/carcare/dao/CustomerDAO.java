package com.cdk.carcare.dao;

import com.cdk.carcare.model.Car;
import com.cdk.carcare.model.Customer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerDAO {

    @PersistenceContext
    EntityManager entityManager;

    public int update(Customer customer){
        entityManager.merge(customer);
        return customer.getCustomerId();
    }

    public int save(Customer customer){
        entityManager.persist(customer);
        return customer.getCustomerId();
    }


    public Customer selectByEmail(String email){
        Query query =  entityManager.createQuery("from Customer where email=" + "'" + email + "'");

        System.out.println("here");
        List<Customer> customers = (ArrayList<Customer>) query.getResultList();
        if(customers.size()==0)
            return null;
        else
            return customers.get(0);
    }

    public Customer selectById(int id){
        return entityManager.find(Customer.class,id);
    }


}
