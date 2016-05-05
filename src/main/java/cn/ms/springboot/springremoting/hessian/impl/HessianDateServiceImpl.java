package cn.ms.springboot.springremoting.hessian.impl;

import cn.ms.springboot.remoting.RemoteService;
import cn.ms.springboot.remoting.ServiceType;
import cn.ms.springboot.springremoting.hessian.HessianDateService;

import java.util.Date;

/**
 * Created by Emily on 16/5/5.
 */
@RemoteService(serviceInterface = HessianDateService.class, serviceType = ServiceType.HESSIAN)
public class HessianDateServiceImpl implements HessianDateService {
    @Override
    public Date getDate() {
        return new Date();
    }
}