package com.cdk.carcare.services;

import com.cdk.carcare.dao.AppointmentDAO;
import com.cdk.carcare.model.Appointment;
import com.cdk.carcare.model.BookAppointmentInfo;
import com.cdk.carcare.model.Car;
import com.cdk.carcare.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AppointmentService {

    @Autowired
    CarService carService;

    @Autowired
    AppointmentDAO appointmentDAO;

    @Autowired
    CustomerService customerService;

    @Autowired
    ServiceProviderService serviceProviderService;

    @Autowired
    ServiceInfoService serviceInfoService;

    @Autowired
    BookAppointmentInfoService bookAppointmentInfoService;


    @Transactional
    public int add(BookAppointmentInfo bookAppointmentInfo) {
        //20 loc
        int serviceId = serviceInfoService.add(bookAppointmentInfoService.makeService(bookAppointmentInfo));
        return appointmentDAO.save(bookAppointmentInfoService.makeAppointment(bookAppointmentInfo, serviceId));
    }
}
