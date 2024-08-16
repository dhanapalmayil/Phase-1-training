package com.lms.intf;

import com.lms.models.User;
import java.util.List;

public interface UserIntf {
    void addUser(User user);
    //User getUser(int userId);
    List<User> getAllUsers();
    void updateUser(int userID, User user);
    void deleteUser(int userId);
}
