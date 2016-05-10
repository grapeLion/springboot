package cn.ms.springboot.config;

import cn.ms.springboot.springremoting.http.rmpl.HttpDateServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by weizheng on 2016/5/6.
 */
@Configuration
public class RmiConfig {

//    <bean id="/remote/HttpDateService.service" class="cn.ms.springboot.springremoting.http.rmpl.HttpDateServiceImpl"/>
    @Bean
    HttpDateServiceImpl httpDateService(){
        return new HttpDateServiceImpl();
    }
}
