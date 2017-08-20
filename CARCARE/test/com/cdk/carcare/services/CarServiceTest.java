package com.cdk.carcare.services;

import com.cdk.carcare.dao.CarDAO;
import com.cdk.carcare.model.Car;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class CarServiceTest {

    CarService carService;
    Car car1;

    @Before
    public void setUp() throws Exception {
        carService = new CarService();
        car1 = new Car(1,"maruti");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void add() throws Exception {

        Car car2=new Car(2,"bmw");
        CarDAO carDAOMock = Mockito.mock(CarDAO.class);
        Mockito.when(carDAOMock.save(car2)).thenReturn(car2.getCarId());
        carService.setCarDAO(carDAOMock);
        int carId = carService.add(car2);
        Assert.assertEquals(carId, 0);
    }

    @Test
    public void readByCar() throws Exception {

        CarDAO carDAOMock = Mockito.mock(CarDAO.class);
        Mockito.when(carDAOMock.read(car1)).thenReturn(car1);
        carService.setCarDAO(carDAOMock);
        Car car2 = carService.readByCar(car1);
        Assert.assertEquals(car2,car1);
    }

    @Test
    public void readById() throws Exception {
        CarDAO carDAOMock = Mockito.mock(CarDAO.class);
        Mockito.when(carDAOMock.selectById(car1.getCarId())).thenReturn(car1);
        carService.setCarDAO(carDAOMock);
        Car car2 = carService.readById(0);
        Assert.assertEquals(car2,car1);
    }

    @Test
    public void readByMake() throws Exception {

        CarDAO carDAOMock = Mockito.mock(CarDAO.class);
        Mockito.when(carDAOMock.selectByMake(car1.getMake())).thenReturn(car1);
        carService.setCarDAO(carDAOMock);
        Car car2 = carService.readByMake(car1.getMake());
        Assert.assertEquals(car2,car1);
    }

}