package com.prog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prog.entity.UserDtls;
import com.prog.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Create or update user
    public void saveUser(UserDtls user) {
        userRepository.save(user);
    }

    // Get all users
    public List<UserDtls> getAllUsers() {
        return userRepository.findAll();
    }

    // Get user by ID
	
	  public UserDtls getUserById(String id) 
	  { 
		 Optional<UserDtls> user = userRepository.findById(id);
		  return user.orElse(null); // Return null if user is not found
	   }
	 
    // Update user details
    public void updateUser(UserDtls user) {
        userRepository.save(user);
    }

    // Delete user by ID
    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }
}