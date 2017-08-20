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
    Customer customer;

    @Before
    public void setUp() throws Exception {
        customerService = new CustomerService();
        customer = new Customer("customer1", 123456789, "mymail1@gmail.com", "pune", "customer2");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void add() throws Exception {

        CustomerDAO customerDAOMock = Mockito.mock(CustomerDAO.class);
        Mockito.when(customerDAOMock.save(customer)).thenReturn(customer.getCustomerId());
        customerService.setCustomerDAO(customerDAOMock);
        int customerId = customerService.add(customer);
        Assert.assertEquals(customerId, 0);
    }

    @Test
    public void testReadByEmail() throws Exception {
        CustomerDAO customerDAOMock = Mockito.mock(CustomerDAO.class);
        Mockito.when(customerDAOMock.selectByEmail(Matchers.anyObject())).thenReturn(customer);
        customerService.setCustomerDAO(customerDAOMock);
        Customer customer = customerService.readByEmail("mymail1@gmail.com");
        Assert.assertEquals("mymail1@gmail.com",customer.getEmail());
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