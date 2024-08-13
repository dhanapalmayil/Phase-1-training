package com.lms.impl;

import com.lms.intf.RoleIntf;
import com.lms.models.Role;
import java.util.ArrayList;
import java.util.List;

public class RoleImpl implements RoleIntf {
    private List<Role> roles = new ArrayList<>();

    @Override
    public void addRole(Role role) {
        roles.add(role);
    }

    @Override
    public Role getRole(int roleId) {
        return roles.stream().filter(r -> r.getRoleId() == roleId).findFirst().orElse(null);
    }

    @Override
    public List<Role> getAllRoles() {
        return roles;
    }

    @Override
    public void updateRole(Role role) {
        roles.replaceAll(r -> r.getRoleId() == role.getRoleId() ? role : r);
    }

    @Override
    public void deleteRole(int roleId) {
        roles.removeIf(r -> r.getRoleId() == roleId);
    }
}
