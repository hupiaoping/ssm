package com.ilovestudy.controller;

import com.ilovestudy.entity.Student;
import com.ilovestudy.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author : Luckee
 * @date : 2019/2/22 22:56
 * @description :
 */

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/addStudent")
    @ResponseBody
    public String addStudent(Student student) throws Exception{
        studentService.addStudent(student);
        return "add student successfully";
    }

    @RequestMapping("/queryAll")
    @ResponseBody
    public List<Student> queryAll()throws Exception {
        return studentService.queryAll();
    }

    @RequestMapping("/query")
    @ResponseBody
    public List<Student> query(Student student)throws Exception {
        return studentService.query(student);
    }
}
