package com.baye.usersmicroservice.service;

import com.baye.usersmicroservice.entities.Role;
import com.baye.usersmicroservice.entities.User;

public interface UserService {
    User saveUser(User user);
    User findUserByUsername (String username);
    Role addRole(Role role);
    User addRoleToUser(String username, String rolename);


}