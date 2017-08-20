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
    public void setUp() {
        customerService = new CustomerService();
        customer = new Customer("customer1", 123456789, "mymail1@gmail.com", "pune", "customer1");
    }

    @After
    public void tearDown() {
    }

    @Test
    public void add() {

        CustomerDAO customerDAOMock = Mockito.mock(CustomerDAO.class);
        Mockito.when(customerDAOMock.save(customer)).thenReturn(customer.getCustomerId());
        customerService.setCustomerDAO(customerDAOMock);
        int customerId = customerService.add(customer);
        Assert.assertEquals(customerId, 0);
    }

    @Test
    public void testReadByEmail() {
        CustomerDAO customerDAOMock = Mockito.mock(CustomerDAO.class);
        Mockito.when(customerDAOMock.selectByEmail(Matchers.anyString())).thenReturn(customer);
        customerService.setCustomerDAO(customerDAOMock);
        Customer customer = customerService.readByEmail("mymail1@gmail.com");
        Assert.assertEquals("mymail1@gmail.com", customer.getEmail());
    }

    @Test
    public void testReadById() {

        CustomerDAO customerDAOMock = Mockito.mock(CustomerDAO.class);
        Mockito.when(customerDAOMock.selectById(Matchers.anyInt())).thenReturn(customer);
        customerService.setCustomerDAO(customerDAOMock);
        Customer customer = customerService.readById(0);
        Assert.assertEquals(0, customer.getCustomerId());
    }

    @Test
    public void testCheckEmailCorrectPassword() {

        CustomerDAO customerDAOMock = Mockito.mock(CustomerDAO.class);
        Mockito.when(customerDAOMock.selectByEmail(Matchers.anyString())).thenReturn(customer);
        customerService.setCustomerDAO(customerDAOMock);
        Customer customer = customerService.checkEmail("mymail1@gmail.com", "customer1");
        Assert.assertEquals(0, customer.getCustomerId());
    }

    @Test
    public void checkEmailWrongPassword() {

        CustomerDAO customerDAOMock = Mockito.mock(CustomerDAO.class);
        Mockito.when(customerDAOMock.selectByEmail(Matchers.anyString())).thenReturn(customer);
        customerService.setCustomerDAO(customerDAOMock);
        Customer customer = customerService.checkEmail("mymail1@gmail.com", "customer2");
        Assert.assertEquals(null, customer);
    }

}