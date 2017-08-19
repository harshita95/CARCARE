package com.cdk.carcare.dao;

import com.cdk.carcare.model.ServiceProvider;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class ServiceProviderDAO {

    @PersistenceContext
    EntityManager entityManager;


    public ServiceProvider selectById(int id){
        return entityManager.find(ServiceProvider.class,id);
    }
}
