package com.cdk.carcare.services;

import com.cdk.carcare.dao.ServiceInfoDAO;
import com.cdk.carcare.model.Car;
import com.cdk.carcare.model.ServiceInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ServiceInfoService {

    @Autowired
    ServiceInfoDAO serviceInfoDAO;

    @Transactional
    public int add(ServiceInfo serviceInfo){
        //20 loc
        return serviceInfoDAO.save(serviceInfo);
    }
}
