package com.cdk.carcare.services;

import com.cdk.carcare.dao.CustomerDAO;
import com.cdk.carcare.model.Car;
import com.cdk.carcare.model.Customer;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Matchers;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class CustomerServiceTest {

    CustomerService customerService;

    @Before
    public void setUp() throws Exception {
        customerService = new CustomerService();
        Customer customer = new Customer("customer1", 12345678, "abc@gmail.com", "pune", "customer1");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void add() throws Exception {
        Customer customer = new Customer("customer1", 12345678, "abc@gmail.com", "pune", "customer1");

        CustomerDAO customerDAOMock = Mockito.mock(CustomerDAO.class);
        Mockito.when(customerDAOMock.save(Matchers.anyObject())).thenReturn(customer.getCustomerId());
        customerService.setCustomerDAO(customerDAOMock);
        int customerId = customerService.add(customer);
        Assert.assertEquals(customerId, 0);
    }

    @Test
    public void readByEmail() throws Exception {
    }

    @Test
    public void readById() throws Exception {
    }

    @Test
    public void authenticate() throws Exception {
    }

    @Test
    public void checkEmail() throws Exception {

    }

}