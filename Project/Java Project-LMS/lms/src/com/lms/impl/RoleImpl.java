package com.lms.impl;

import com.lms.intf.RoleIntf;
import com.lms.models.Role;
import com.lms.repository.RoleRepository;
import java.util.List;

public class RoleImpl implements RoleIntf {
	 private RoleRepository roleRepository;

	    public RoleImpl() {
	        this.roleRepository = new RoleRepository();
	    }

    @Override
    public void addRole(Role role) {
    	roleRepository.addRole(role);
    }


    @Override
    public List<Role> getAllRoles() {
        return roleRepository.getAllRoles();
    }

    @Override
    public void updateRole(int roleId, Role role) {
    	roleRepository.updateRole(roleId, role);
    }

    @Override
    public void deleteRole(int roleId) {
    	roleRepository.deleteRole(roleId);
    }
}
