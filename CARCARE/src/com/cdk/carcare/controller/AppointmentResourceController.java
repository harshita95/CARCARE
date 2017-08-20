package com.cdk.carcare.controller;

import com.cdk.carcare.model.BookAppointmentInfo;
import com.cdk.carcare.services.AppointmentService;
import com.cdk.carcare.services.BookAppointmentInfoService;
import com.cdk.carcare.services.CarService;
import com.cdk.carcare.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.MediaType.TEXT_PLAIN_VALUE;

@RestController
public class AppointmentResourceController {

    @Autowired
    CustomerService customerService;
    @Autowired
    CarService carService;
    @Autowired
    AppointmentService appointmentService;
    @Autowired
    BookAppointmentInfoService bookAppointmentInfoService;


    @RequestMapping(value = "/add/appointment",consumes = APPLICATION_JSON_VALUE ,produces = TEXT_PLAIN_VALUE ,method = RequestMethod.POST)
    public String addAppointment(@RequestBody BookAppointmentInfo bookAppointmentInfo){
        System.out.println(bookAppointmentInfo);
        String name = appointmentService.checkAvailability(bookAppointmentInfo.getMake(),bookAppointmentInfo.getCurrentDate(),bookAppointmentInfo.getFirstSlot(),bookAppointmentInfo.getSecondSlot(),bookAppointmentInfo.getThirdSlot());
        if(!name.equals("false")) {
            appointmentService.add(bookAppointmentInfo);
            return name;
        }
        else {
            System.out.println("false return");
            return "false";
        }
    }
}
