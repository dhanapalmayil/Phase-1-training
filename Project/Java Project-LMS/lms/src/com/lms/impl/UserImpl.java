package com.lms.impl;

import com.lms.intf.UserIntf;
import com.lms.models.User;
import com.lms.repository.UserRepository;

import java.util.List;

public class UserImpl implements UserIntf {
	 private UserRepository userRepository;

	    public UserImpl() {
	        this.userRepository = new UserRepository();
	    }
    

    @Override
    public void addUser(User user) {
    	userRepository.addUser(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    @Override
    public void updateUser(int userID, User user) {
    	userRepository.updateUser(userID, user);
    }

    @Override
    public void deleteUser(int userId) {
    	userRepository.deleteUser(userId);
    }
}
