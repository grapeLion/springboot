package cn.ms.springboot.config;

import cn.ms.springboot.springremoting.http.HttpDateService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;

/**
 * Created by weizheng on 2016/5/6.
 */
@Configuration
public class RmiConfig {

    @Bean(name = {"httpDateService"})
    HttpInvokerProxyFactoryBean httpInvokerProxyFactoryBean(){
        HttpInvokerProxyFactoryBean httpInvokerProxyFactoryBean = new HttpInvokerProxyFactoryBean();
        httpInvokerProxyFactoryBean.setServiceUrl("http://172.17.2.230:8080/springboot-1.0-SNAPSHOT/httpDateService");
        httpInvokerProxyFactoryBean.setServiceInterface(HttpDateService.class);
        return httpInvokerProxyFactoryBean;
    }
}
