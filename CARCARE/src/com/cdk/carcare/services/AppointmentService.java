package com.cdk.carcare.services;

import com.cdk.carcare.dao.AppointmentDAO;
import com.cdk.carcare.model.*;
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


    public String checkAvailability(String make, String currentDate, String firstSlot, String secondSlot, String thirdSlot) {

        Car car = carService.readByMake(make);
        ServiceProvider serviceProvider = serviceProviderService.readById(car.getServiceId());
        Boolean result = appointmentDAO.checkAvailability(car.getCarId(),currentDate,firstSlot,secondSlot,thirdSlot);
        if(result == true){
            return serviceProvider.getName();
        }
        else {
            System.out.println("Service me false return");
            return "false";
        }
    }
}
