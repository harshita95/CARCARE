package com.cdk.carcare.services;

import com.cdk.carcare.dao.CarDAO;
import com.cdk.carcare.dao.ServiceProviderDAO;
import com.cdk.carcare.model.Car;
import com.cdk.carcare.model.ServiceProvider;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Matchers;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class ServiceProviderServiceTest {

    ServiceProviderService serviceProviderService;
    ServiceProvider serviceProvider;
    CarService carService;
    Car car;

    @Before
    public void setUp() throws Exception {
        serviceProviderService = new ServiceProviderService();
        carService = new CarService();
        serviceProvider=new ServiceProvider("Ramesh");
        car = new Car("maruti");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testReadByCarMake() throws Exception {
        ServiceProviderDAO serviceProviderDAOMock = Mockito.mock(ServiceProviderDAO.class);
        CarDAO carDAOMock = Mockito.mock(CarDAO.class);
        Mockito.when(carDAOMock.selectByMake(Matchers.anyString())).thenReturn(car);
        Mockito.when(serviceProviderDAOMock.selectById(Matchers.anyInt())).thenReturn(serviceProvider);
        serviceProviderService.setServiceProviderDAO(serviceProviderDAOMock);
        carService.setCarDAO(carDAOMock);
        ServiceProvider serviceProvider1 = serviceProviderService.readByCarMake("maruti");
        System.out.println(serviceProvider1);
        Assert.assertEquals(0, serviceProvider1.getId());
    }

    @Test
    public void readById() throws Exception {
    }

}