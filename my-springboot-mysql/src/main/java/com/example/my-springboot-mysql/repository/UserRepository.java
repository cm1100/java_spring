package com.example.myspringbootmysql.repository;

import com.example.myspringbootmysql.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
