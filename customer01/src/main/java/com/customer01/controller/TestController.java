package com.customer01.controller;

import com.customer01.bean.Student;
import com.customer01.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class TestController {

    //@Autowired
    //RestTemplate restTemplate;

    @Autowired
    TestService testService;
    @RequestMapping("hi")
    @ResponseBody
    public String hi(){
        Student stu = new Student(2,"小夏");
        //ResponseEntity<String> forEntity = restTemplate.postForEntity("http://SERVICE01/hi",stu,String.class );
        String str = testService.hi(stu);
        return str;
    }
}
