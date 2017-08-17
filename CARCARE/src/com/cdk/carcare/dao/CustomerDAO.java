package com.cdk.carcare.dao;

import com.cdk.carcare.model.Customer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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

         Customer customer = (Customer) query.getSingleResult();
         return customer;
    }


//    public List<Customer> selectAll(){
//        return entityManager.createQuery("from Customer").getResultList();
//
//    }
//
//
//    public void delete(int id) {
//        Customer customer = entityManager.find(Customer.class,id);
//        entityManager.remove(customer);
//    }

}
