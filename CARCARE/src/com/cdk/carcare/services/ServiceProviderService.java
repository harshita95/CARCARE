package com.cdk.carcare.services;

import com.cdk.carcare.dao.CarDAO;
import com.cdk.carcare.dao.ServiceProviderDAO;
import com.cdk.carcare.model.Car;
import com.cdk.carcare.model.Customer;
import com.cdk.carcare.model.ServiceProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ServiceProviderService {

    @Autowired
    ServiceProviderDAO serviceProviderDAO;


    @Autowired
    CarDAO carDAO;


    @Transactional
    public ServiceProvider readByCarMake(String make) {
        Car car=carDAO.selectByMake(make);
        return serviceProviderDAO.selectById(car.getServiceId());
    }

    @Transactional
    public ServiceProvider readById(int id) {
        return serviceProviderDAO.selectById(id);
    }
}
