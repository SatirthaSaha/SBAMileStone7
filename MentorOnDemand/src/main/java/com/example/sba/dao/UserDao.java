package com.example.sba.dao;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sba.model.User;

@Repository
public interface UserDao extends JpaRepository<User, BigInteger>{
	User findByEmail(String email);
}
