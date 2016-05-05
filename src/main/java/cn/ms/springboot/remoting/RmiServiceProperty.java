package cn.ms.springboot.remoting;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;
import java.rmi.registry.Registry;

@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface RmiServiceProperty {
    int registryPort() default Registry.REGISTRY_PORT;
}