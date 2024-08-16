package com.lms.impl;

import com.lms.intf.UserIntf;
import com.lms.models.User;
import java.util.ArrayList;
import java.util.List;

public class UserImpl implements UserIntf {
    private List<User> users = new ArrayList<>();

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public User getUser(int userId) {
        return users.stream().filter(u -> u.getUserId() == userId).findFirst().orElse(null);
    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }

    @Override
    public void updateUser(User user) {
        users.replaceAll(u -> u.getUserId() == user.getUserId() ? user : u);
    }

    @Override
    public void deleteUser(int userId) {
        users.removeIf(u -> u.getUserId() == userId);
    }
}
