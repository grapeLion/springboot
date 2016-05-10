package cn.ms.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by weizheng on 2016/5/4.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hellodddddd,world";
    }
}
