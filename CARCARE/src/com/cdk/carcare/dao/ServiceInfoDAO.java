package com.cdk.carcare.dao;

import com.cdk.carcare.model.ServiceInfo;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class ServiceInfoDAO {

    @PersistenceContext
    EntityManager entityManager;


    public int save(ServiceInfo serviceInfo){
        entityManager.persist(serviceInfo);
        return serviceInfo.getId();
    }
}
