package com.spring.test.repository;

import java.util.List;

import com.spring.test.model.User;

public interface UserRepository {
	
	List<User> findAll();

}
