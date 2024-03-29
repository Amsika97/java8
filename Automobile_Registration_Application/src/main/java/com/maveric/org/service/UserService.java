package com.maveric.org.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maveric.org.entity.User_Data;
import com.maveric.org.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository repo;

	public User_Data UserRegistration(User_Data user) {
		
		User_Data savedUser = repo.save(user);
//	    System.out.println(savedUser);
	    return savedUser;
//		return repo.save(user);
		
			
	}

	public List<String> UserList() {
		List<User_Data> findAllUser = repo.findAll();
	 List<String> Username = findAllUser.stream().map(user -> user.getUserName() + ", " + user.getMobileNumber()).collect(Collectors.toList());
		return Username;
		
//		return repo.findAll();
	}

	

	
}
