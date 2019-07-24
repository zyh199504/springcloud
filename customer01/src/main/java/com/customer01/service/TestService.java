package com.customer01.service;


import com.customer01.bean.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "service01")
public interface TestService {
    @RequestMapping("/hi")
    public String hi(Student stu);
}
