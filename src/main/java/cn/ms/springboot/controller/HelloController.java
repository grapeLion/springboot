package cn.ms.springboot.controller;

import cn.ms.springboot.springremoting.http.HttpDateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;

/**
 * Created by weizheng on 2016/5/4.
 */
@RestController
public class HelloController {
    @Autowired
    HttpDateService httpDateService;
    @RequestMapping("/")
    public String hello(){
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(httpDateService.getDate()));
        return "hello,world";
    }
}
