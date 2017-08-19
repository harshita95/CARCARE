package com.cdk.carcare.dao;

import com.cdk.carcare.model.Appointment;
import com.cdk.carcare.model.Customer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class AppointmentDAO {
    @PersistenceContext
    EntityManager entityManager;


    public int save(Appointment appointment){
//        entityManager.persist(appointment.getServiceInfo());
        entityManager.persist(appointment);
        return appointment.getId();
    }
}