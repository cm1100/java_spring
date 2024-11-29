package com.chaitanya.cruddemo.dao;

import com.chaitanya.cruddemo.entity.Student;

import java.util.List;

public interface StudentDao {

    void save(Student theStudent);

    Student findById(Long id);

    List<Student> findAll();

    void update(Student student);

    void delete(Long id);
}
