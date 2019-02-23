package com.ilovestudy.service.serviceImpl;

import com.ilovestudy.dao.StudentMapper;
import com.ilovestudy.entity.Student;
import com.ilovestudy.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : Luckee
 * @date : 2019/2/22 21:14
 * @description :
 */

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper mapper;

    @Override
    public void addStudent(Student student) throws Exception {
        mapper.insertStudent(student);
    }

    @Override
    public List<Student> queryAll() throws Exception {
        return mapper.selectAll();
    }

    @Override
    public List<Student> query(Student student) throws Exception {
        return mapper.select(student);
    }
}
