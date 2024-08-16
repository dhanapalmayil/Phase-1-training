package com.lms.service;

import com.lms.models.User;
import com.lms.intf.*;
import com.lms.repository.UserRepository;
import java.util.List;

public class UserService implements UserIntf  {
    private UserRepository userRepository;

    public UserService() {
        this.userRepository = new UserRepository();
    }

    public void addUser(User user) {
        userRepository.addUser(user);
    }

    public void updateUser(int userId, User updatedUser) {
        userRepository.updateUser(userId, updatedUser);
    }

    public void deleteUser(int userId) {
        userRepository.deleteUser(userId);
    }

    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

	@Override
	public User getUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}
}
