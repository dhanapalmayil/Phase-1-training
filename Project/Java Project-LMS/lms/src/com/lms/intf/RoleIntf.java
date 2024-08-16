package com.lms.intf;

import com.lms.models.Role;
import java.util.List;

public interface RoleIntf {
    void addRole(Role role);
    List<Role> getAllRoles();
    void updateRole(int roleId, Role role);
    void deleteRole(int roleId);
}
