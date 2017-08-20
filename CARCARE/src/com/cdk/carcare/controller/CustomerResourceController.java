package com.cdk.carcare.controller;

import com.cdk.carcare.model.Customer;
import com.cdk.carcare.services.CarService;
import com.cdk.carcare.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.*;

@RestController
public class CustomerResourceController {

    @Autowired
    CustomerService customerService;
    @Autowired
    CarService carService;

    @RequestMapping(value = "/add", consumes = APPLICATION_JSON_VALUE, produces = TEXT_PLAIN_VALUE, method = RequestMethod.POST)
    public String addCustomer(@RequestBody Customer customer) {
        System.out.println(customer);
        int value = customerService.add(customer);
        return value + "";
    }

    @RequestMapping(value = "/customer/{email}", produces = APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public Customer readCustomerByEmailAsJson(@PathVariable String email) {
        System.out.println("VIN is : " + email);
        Customer customer = customerService.readByEmail(email);
        System.out.println(customer);
        return customer;
    }

    @RequestMapping(value = "/check/{email}/{password}", produces = TEXT_PLAIN_VALUE, method = RequestMethod.POST)
    public String checkCustomer(@PathVariable String email, @PathVariable String password) {
        System.out.println("in check customer");
        Customer customer = customerService.checkEmail(email, password);
        if (customer == null) {
            return "null";
        } else {
            return (customer.getCustomerId() + "");
        }
    }
}