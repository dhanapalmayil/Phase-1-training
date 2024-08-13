package com.lms.repository;

import com.lms.models.User;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void updateUser(int userId, User updatedUser) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUserId() == userId) {
                users.set(i, updatedUser);
                break;
            }
        }
    }

    public void deleteUser(int userId) {
        users.removeIf(user -> user.getUserId() == userId);
    }

    public List<User> getAllUsers() {
        return new ArrayList<>(users);
    }
}
