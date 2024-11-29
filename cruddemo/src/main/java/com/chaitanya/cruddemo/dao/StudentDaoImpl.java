package com.chaitanya.cruddemo.dao;

import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.chaitanya.cruddemo.entity.Student;

import jakarta.persistence.EntityManager;

import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao{

    // define entity manager
    private EntityManager entityManager;

    @Autowired
    public StudentDaoImpl(EntityManager entityManager){
        this.entityManager=entityManager;

    }

    @Override
    @Transactional
    public void save(Student theStudent){
        entityManager.persist(theStudent);
    }

    @Override
    public Student findById(Long id){
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> theQuery = entityManager.createQuery("from Student order by email",Student.class);
        return theQuery.getResultList();
    }

    @Override
    @Transactional
    public void update(Student student) {
        entityManager.merge(student);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        Student myStudent = entityManager.find(Student.class,id);
        if(myStudent!=null){
            entityManager.remove(myStudent);
        }

    }
}
