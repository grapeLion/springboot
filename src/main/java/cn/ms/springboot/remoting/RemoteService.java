package cn.ms.springboot.remoting;

import cn.ms.springboot.remoting.ServiceType;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * Created by Emily on 16/5/5.
 */
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface RemoteService {

//    RemoteService辅助标签RmiServiceProperty，在发布RMI服务时，用来指定RMI服务发布的端口。

    ServiceType serviceType() default ServiceType.HTTP;
    Class<?> serviceInterface();
}
