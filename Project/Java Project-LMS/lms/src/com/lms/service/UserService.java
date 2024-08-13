package com.lms.service;

import com.lms.models.User;
import com.lms.repository.UserRepository;
import java.util.List;

public class UserService {
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
}
