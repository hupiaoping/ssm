package com.ilovestudy.entity;

import java.util.Objects;

/**
 * @author : Luckee
 * @date : 2019/2/22 20:55
 * @description :
 */
public class Student {
    private Integer id;
    private String number;
    private String name;
    private Integer age;

    public Student() {

    }

    public Student(Integer id, String number, String name, Integer age) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) &&
                Objects.equals(number, student.number) &&
                Objects.equals(name, student.name) &&
                Objects.equals(age, student.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, number, name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
