package com.ilovestudy.dao;

import com.ilovestudy.entity.Student;

import java.util.List;

public interface StudentMapper {
    void insertStudent(Student student) throws Exception;
    List<Student> selectAll()throws Exception;
    List<Student> select(Student student)throws Exception;
}
