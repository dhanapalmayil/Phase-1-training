package com.lms.repository;

import com.lms.models.Role;
import java.util.ArrayList;
import java.util.List;

public class RoleRepository {
    private List<Role> roles = new ArrayList<>();

    public void addRole(Role role) {
        roles.add(role);
    }

    public void updateRole(int roleId, Role updatedRole) {
        for (int i = 0; i < roles.size(); i++) {
            if (roles.get(i).getRoleId() == roleId) {
                roles.set(i, updatedRole);
                break;
            }
        }
    }

    public void deleteRole(int roleId) {
        roles.removeIf(role -> role.getRoleId() == roleId);
    }

    public List<Role> getAllRoles() {
        return new ArrayList<>(roles);
    }
}
