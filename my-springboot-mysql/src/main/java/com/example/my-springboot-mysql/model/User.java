package com.example.myspringbootmysql.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    private Long id;
    private String name;
    private String email;

    // Getters and Setters
}
