package com.example.User.Service;

import org.springframework.stereotype.Service;
import com.example.User.Entities.User;
import com.example.User.Repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserService {
	@Autowired
	
	private UserRepository repo;
	public User login(String username,String password) {
		User user = repo.findByUsernameAndPassword(username, password);
		return user;
	}

}
