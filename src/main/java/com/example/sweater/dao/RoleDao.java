package com.example.sweater.dao;

import com.example.sweater.model.Role;


import java.util.List;

public interface RoleDao {

    List<Role> getAllRoles();

    Role getRole(String userRole);

    Role getRoleById(Long id);

    void addRole(Role role);
}
