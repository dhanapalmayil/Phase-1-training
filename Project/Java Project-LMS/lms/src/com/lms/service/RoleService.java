package com.lms.service;

import com.lms.impl.RoleImpl;
import com.lms.intf.RoleIntf;
import com.lms.models.Role;
import java.util.List;
import java.util.Scanner;

public class RoleService {
	private RoleIntf roleIntf;

    public RoleService() {
        this.roleIntf = new RoleImpl();
    }

    public void addRole(Role role) {
    	roleIntf.addRole(role);
        System.out.println("Role added successfully.");
    }

    public void updateRole(int roleId, Role updatedRole) {
    	roleIntf.updateRole(roleId, updatedRole);
        System.out.println("Role updated successfully.");
    }

    public void deleteRole(int roleId) {
    	roleIntf.deleteRole(roleId);
        System.out.println("Role deleted successfully.");
    }

    public List<Role> getAllRoles() {
        return roleIntf.getAllRoles();
    }

    public void manageRoles(Scanner scanner) {
        int choice = -1;

        while (choice != 0) {
            System.out.println("Role Management");
            System.out.println("1. Add Role");
            System.out.println("2. Update Role");
            System.out.println("3. Delete Role");
            System.out.println("4. List Roles");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Role ID: ");
                    int roleId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Role Name: ");
                    String roleName = scanner.nextLine();
                    Role role = new Role(roleId, roleName);
                    addRole(role);
                    break;
                case 2:
                    System.out.print("Enter Role ID to update: ");
                    int updateRoleId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter new Role Name: ");
                    String newRoleName = scanner.nextLine();
                    Role updatedRole = new Role(updateRoleId, newRoleName);
                    updateRole(updateRoleId, updatedRole);
                    break;
                case 3:
                    System.out.print("Enter Role ID to delete: ");
                    int deleteRoleId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    deleteRole(deleteRoleId);
                    break;
                case 4:
                    System.out.println("List of Roles:");
                    for (Role r : getAllRoles()) {
                        System.out.println(r);
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
