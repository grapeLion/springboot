package cn.ms.springboot.springremoting.http.rmpl;

import cn.ms.springboot.remoting.RemoteService;
import cn.ms.springboot.remoting.ServiceType;
import cn.ms.springboot.springremoting.http.HttpDateService;

import java.util.Date;

/**
 * Created by Emily on 16/5/5.
 */
@RemoteService(serviceInterface = HttpDateService.class, serviceType = ServiceType.HTTP)
public class HttpDateServiceImpl implements HttpDateService {

    @Override
    public Date getDate() {
        return new Date();
    }
}