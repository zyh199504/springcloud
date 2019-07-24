package com.service02.controller;

import com.service02.bean.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @Value("${server.port}")
    String port;

    @RequestMapping("hi")
    @ResponseBody
    public String hi(@RequestBody Student stu){
        return "端口 ："+ port+"  name："+stu.getName() +" id :" + stu.getId();
    }
}
