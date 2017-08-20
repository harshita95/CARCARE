package com.cdk.carcare.services;

import com.cdk.carcare.dao.CarDAO;
import com.cdk.carcare.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CarService {

    @Autowired
    CarDAO carDAO;

    @Transactional
    public int add(Car car){
        return carDAO.save(car);
    }

    @Transactional
    public Car readByCar(Car car){
        System.out.println("I am in read by car");
        return carDAO.read(car);
    }

    @Transactional
    public Car readById(int id){
        return carDAO.selectById(id);
    }

    public Car readByMake(String make) {
        return carDAO.selectByMake(make);
    }

    public void setCarDAO(CarDAO carDAO) {
        this.carDAO = carDAO;
    }
}
