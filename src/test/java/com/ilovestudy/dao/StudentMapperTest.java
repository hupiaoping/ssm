package com.ilovestudy.dao;

import com.ilovestudy.entity.Student;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class StudentMapperTest {

    private ClassPathXmlApplicationContext context = null;
    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("classpath:spring/spring-dao.xml");
    }

    @Test
    public void testInsertStudent() throws Exception {
        StudentMapper mapper = context.getBean(StudentMapper.class);
        Student student = new Student();
        student.setNumber("13108313");
        student.setName("hpp");
        student.setAge(24);
        mapper.insertStudent(student);
    }

    @After
    public void tearDown() throws Exception {
        context.close();
    }
}