package com.lms.intf;

import com.lms.models.Role;
import java.util.List;

public interface RoleIntf {
    void addRole(Role role);
    Role getRole(int roleId);
    List<Role> getAllRoles();
    void updateRole(Role role);
    void deleteRole(int roleId);
}
