package com.hemanshu;

import org.springframework.data.repository.CrudRepository;

import com.hemanshu.User;

public interface UserRepository extends CrudRepository<User, Integer> {	
	
	public User findByUsernameAndPassword(String username, String password);
}
