package cn.ms.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;

/**
 * Created by weizheng on 2016/5/4.
 */
@RestController
public class HelloController {
    @RequestMapping("/")
    public String hello(){
        return null;
    }
}
