package com.example.study.repository;

import com.example.study.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    //Query Method

    //Select * From user where account = ?
    Optional<User> findByAccount(String account);

    //select * from user where email = ?
    Optional<User> findByEmail(String email);

    //Select * From user where account = ? and email =?
    Optional<User> findByAccountAndEmail(String account,String email);
}

