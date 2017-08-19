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

//    @RequestMapping(value = "/customers",produces = APPLICATION_JSON_VALUE ,method = RequestMethod.GET)
//    public Collection<Customer> readAllCustomersAsJson(){
//        return customerService.readAll();
//    }
//
//    @RequestMapping(value = "/customers",produces = APPLICATION_XML_VALUE ,method = RequestMethod.GET)
//    public Collection<Customer> readAllCustomersAsXML(){
//        return customerService.readAll();
//    }
//
//
//
//    @RequestMapping(value = "/delete/{id}",produces = TEXT_PLAIN_VALUE ,method = RequestMethod.DELETE)
//    public String deleteCustomer(@PathVariable int id){
//        customerService.remove(id);
//        return "Customer with id '"+id+"'resource deleted successfully!";
//    }
//
//    @RequestMapping(value = "/update/{id}",consumes = APPLICATION_JSON_VALUE ,produces = TEXT_PLAIN_VALUE ,method = RequestMethod.PUT)
//    public String updateCustomer(@RequestBody Customer customer, @PathVariable int id){
//        customer.setCustomerId(id);
//        int value = customerService.modify(customer);
//        return "Customer with id '"+value+" ' resource updated successfully!";
//    }


    @RequestMapping(value = "/add", consumes = APPLICATION_JSON_VALUE, produces = TEXT_PLAIN_VALUE, method = RequestMethod.POST)
    public String addCustomer(@RequestBody Customer customer) {
        System.out.println(customer);
        int value = customerService.add(customer);
        return value + "";
    }

//    @RequestMapping(value = "/add/car/{email}",consumes = APPLICATION_JSON_VALUE ,produces = TEXT_PLAIN_VALUE ,method = RequestMethod.PUT)
//    public String addCar(@RequestBody Car car,@PathVariable String email){
//        System.out.println("I am in add car");
//        System.out.println(car);
//        Car presentCar = carService.readByCar(car);
//        System.out.println(presentCar);
//        int value = customerService.addCar(presentCar,email);
//        return "Customer with id '"+value+" ' resource added successfully!";
//    }

//    @RequestMapping(value = "/add",consumes = APPLICATION_JSON_VALUE ,produces = TEXT_PLAIN_VALUE ,method = RequestMethod.POST)
//    public String checkDetails(@PathVariable String email,@PathVariable String password){
//        customerService.authenticate(email,password);
//
//    }


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