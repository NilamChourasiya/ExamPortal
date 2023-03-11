package com.examportal.examserver.service;

import com.examportal.examserver.entity.User;
import com.examportal.examserver.entity.UserRole;

import java.util.Set;

public interface UserService {
    //Creating user
    public User createUser(User user, Set<UserRole> userRoles) throws Exception;
    // get user  by username
    public User getUser(String username);
    //delete user by userid
    public void deleteUser(Long userId);
}
