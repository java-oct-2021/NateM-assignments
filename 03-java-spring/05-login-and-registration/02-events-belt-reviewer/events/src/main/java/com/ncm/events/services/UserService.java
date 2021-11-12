package com.ncm.events.services;

import java.util.List;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncm.events.models.User;
import com.ncm.events.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;


	//find all users
	public List<User> allUsers(){
		return userRepo.findAll();
	}
	//create user
	public User createUser(User newUser) {
		return this.userRepo.save(newUser);
		}
	//get one user
	public User getUser(Long id) {
		return this.userRepo.findById(id).orElse(null);
	}
	//find by email
	public User findByEmail(String email) {
		return this.userRepo.findByEmail(email);
	}
	//register and hash user
	public User registerUser(User user) {
		String hashed = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
		user.setPassword(hashed);
		return this.userRepo.save(user);
	}
	//authenticate user
	public boolean authenticateUser(String email, String password) {
		User user = this.userRepo.findByEmail(email);
		if(user==null) {
			return false;
		} else {
			if(BCrypt.checkpw(password, user.getPassword())) {
				return true;
			} else {
				return false;
			}
		}
	}
}