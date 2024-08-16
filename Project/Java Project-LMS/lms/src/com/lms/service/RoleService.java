package com.lms.service;

import com.lms.models.Role;
import com.lms.intf.*;
import com.lms.repository.RoleRepository;
import java.util.List;

public class RoleService implements RoleIntf{
    private RoleRepository roleRepository;

    public RoleService() {
        this.roleRepository = new RoleRepository();
    }

    public void addRole(Role role) {
        roleRepository.addRole(role);
    }

    public void updateRole(int roleId, Role updatedRole) {
        roleRepository.updateRole(roleId, updatedRole);
    }

    public void deleteRole(int roleId) {
        roleRepository.deleteRole(roleId);
    }

    public List<Role> getAllRoles() {
        return roleRepository.getAllRoles();
    }

	@Override
	public Role getRole(int roleId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateRole(Role role) {
		// TODO Auto-generated method stub
		
	}
}
