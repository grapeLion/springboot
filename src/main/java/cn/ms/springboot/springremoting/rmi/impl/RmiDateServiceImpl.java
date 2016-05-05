package cn.ms.springboot.springremoting.rmi.impl;

import cn.ms.springboot.remoting.RemoteService;
import cn.ms.springboot.remoting.RmiServiceProperty;
import cn.ms.springboot.remoting.ServiceType;
import cn.ms.springboot.springremoting.rmi.RmiDateService;

import java.util.Date;

/**
 * Created by Emily on 16/5/5.
 */
@RemoteService(serviceInterface = RmiDateService.class, serviceType = ServiceType.RMI)
@RmiServiceProperty(registryPort = 1099)
public class RmiDateServiceImpl implements RmiDateService{
    @Override
    public Date getDate() {
        return new Date();
    }
}