package com.ilovestudy.service;

import com.ilovestudy.entity.Student;

import java.util.List;

public interface StudentService {

    void addStudent(Student student) throws Exception;

    List<Student> queryAll()throws Exception;

    List<Student> query(Student student)throws Exception;
}
