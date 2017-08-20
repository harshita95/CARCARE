package com.cdk.carcare.services;

import com.cdk.carcare.model.Appointment;
import com.cdk.carcare.model.BookAppointmentInfo;
import com.cdk.carcare.model.Car;
import com.cdk.carcare.model.ServiceInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookAppointmentInfoService {


    @Autowired
    CarService carService;
    public ServiceInfo makeService(BookAppointmentInfo bookAppointmentInfo) {
        String ac = bookAppointmentInfo.getAc();
        String battery = bookAppointmentInfo.getBattery();
        String washing = bookAppointmentInfo.getWashing();
        String accidental = bookAppointmentInfo.getAccidental();
        String regular = bookAppointmentInfo.getRegular();
        ServiceInfo serviceInfo = new ServiceInfo(battery, ac, accidental, regular, washing);
        return serviceInfo;
    }

    public Appointment makeAppointment(BookAppointmentInfo bookAppointmentInfo,int serviceId) {
        String currentDate=bookAppointmentInfo.getCurrentDate();
        String firstSlot=bookAppointmentInfo.getFirstSlot();
        String secondSlot=bookAppointmentInfo.getSecondSlot();
        String thirdSlot=bookAppointmentInfo.getThirdSlot();
        Appointment appointment=new Appointment(currentDate,firstSlot,secondSlot,thirdSlot);
        Car car = carService.readByMake(bookAppointmentInfo.getMake());
        appointment.setCarId(car.getCarId());
        appointment.setCustomerId(bookAppointmentInfo.getCustomerId());
        appointment.setServiceId(serviceId);
        System.out.println(appointment);
        return appointment;
    }
}
