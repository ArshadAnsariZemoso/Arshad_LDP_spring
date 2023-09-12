package com.springdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springdb.bean.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
