package com.cdk.carcare.dao;

import com.cdk.carcare.model.Appointment;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

@Repository
public class AppointmentDAO {
    @PersistenceContext
    EntityManager entityManager;


    public int save(Appointment appointment) {
//        entityManager.persist(appointment.getServiceInfo());
        entityManager.persist(appointment);
        return appointment.getId();
    }


    public Boolean checkAvailability(int id, String currentDate, String firstSlot, String secondSlot, String thirdSlot) {
        System.out.println("id = " + id + " date= " + currentDate + " 1slot=" + firstSlot + " 2slot=" + secondSlot + " 3slot=" + thirdSlot);
        int a=1;
        int b=0;
        int c=0;
        Query query = entityManager.createQuery("from Appointment where carId=" + "'" + id + "'" + "and firstSlot=" + "'" + firstSlot + "'" + "and secondSlot=" + "'" + secondSlot + "'" + "and thirdSlot=" + "'" + thirdSlot + "'" + "and newDate=" + "'" + currentDate + "'");
        //Query query = entityManager.createQuery("from Appointment where carId=" + "'" + id + "'" + "and firstSlot=" + "'" + a + "'" + "and secondSlot=" + "'" + b + "'" + "and thirdSlot=" + "'" + c + "'" + "and newDate=" + "'" + currentDate + "'");
        System.out.println("ye chala");
        List<Appointment> appointments = (ArrayList<Appointment>) query.getResultList();
        if (appointments.size() == 0) {
            System.out.println("I am in true");
            return true;
        } else {
            System.out.println("I am in false chal gya");
            return false;
        }
    }
}