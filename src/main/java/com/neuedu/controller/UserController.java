package com.neuedu.controller;

import com.neuedu.pojo.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by guojiacheng on 2019/4/3.
 */
@RestController
public class UserController {
    @GetMapping("/index")
    public Student index(){
        Student student = new Student();
        student.setId(1);
        student.setName("宝宝");
        student.setDate(new Date());

        return student;
    }
}
