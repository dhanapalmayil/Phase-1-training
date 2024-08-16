package com.lms.service;

import com.lms.models.User;
import com.lms.models.Role;
import com.lms.impl.UserImpl;
import com.lms.intf.UserIntf;

import java.util.List;
import java.util.Scanner;

public class UserService {
    
    private UserIntf userIntf;

    public UserService() {
        this.userIntf = new UserImpl();
    }

    public void addUser(User user) {
        userIntf.addUser(user);
        System.out.println("User added successfully.");
    }

    public void updateUser(int userId, User updatedUser) {
    	userIntf.updateUser(userId, updatedUser);
        System.out.println("User updated successfully.");
    }

    public void deleteUser(int userId) {
    	userIntf.deleteUser(userId);
        System.out.println("User deleted successfully.");
    }

    public List<User> getAllUsers() {
        return userIntf.getAllUsers();
    }

    public void manageUsers(Scanner scanner) {
        int choice = -1;

        while (choice != 0) {
            System.out.println("User Management");
            System.out.println("1. Add User");
            System.out.println("2. Update User");
            System.out.println("3. Delete User");
            System.out.println("4. List Users");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter User ID: ");
                    int userId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Username: ");
                    String username = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter Role ID: ");
                    int roleId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    Role role = new Role(roleId, "Role Name"); // Adjust as needed
                    User user = new User(userId, username, email, role);
                    addUser(user);
                    break;
                case 2:
                    System.out.print("Enter User ID to update: ");
                    int updateUserId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter new Username: ");
                    String newUsername = scanner.nextLine();
                    System.out.print("Enter new Email: ");
                    String newEmail = scanner.nextLine();
                    System.out.print("Enter new Role ID: ");
                    int newRoleId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    Role newRole = new Role(newRoleId, "New Role Name"); // Adjust as needed
                    User updatedUser = new User(updateUserId, newUsername, newEmail, newRole);
                    updateUser(updateUserId, updatedUser);
                    break;
                case 3:
                    System.out.print("Enter User ID to delete: ");
                    int deleteUserId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    deleteUser(deleteUserId);
                    break;
                case 4:
                    System.out.println("List of Users:");
                    for (User u : getAllUsers()) {
                        System.out.println(u);
                    }
                    break;
                case 0:
                    System.out.println("Returning to Main Menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

