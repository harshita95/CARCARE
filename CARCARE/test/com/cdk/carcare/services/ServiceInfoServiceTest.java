package com.cdk.carcare.services;

import com.cdk.carcare.dao.ServiceInfoDAO;
import com.cdk.carcare.model.ServiceInfo;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class ServiceInfoServiceTest {

    ServiceInfoService serviceInfoService;
    ServiceInfo serviceInfo;

    @Before
    public void setUp() throws Exception {
        serviceInfoService = new ServiceInfoService();
        serviceInfo= new ServiceInfo("true","false","true","true","false");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void add() throws Exception {

        ServiceInfoDAO serviceInfoDAOMock = Mockito.mock(ServiceInfoDAO.class);
        Mockito.when(serviceInfoDAOMock.save(serviceInfo)).thenReturn(serviceInfo.getId());
        serviceInfoService.setserviceInfoDAO(serviceInfoDAOMock);
        int serviceInfoId = serviceInfoService.add(serviceInfo);
        Assert.assertEquals(0,serviceInfo.getId());
    }

}