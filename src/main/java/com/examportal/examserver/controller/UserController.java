package com.examportal.examserver.controller;
import com.examportal.examserver.entity.Role;
import com.examportal.examserver.entity.User;
import com.examportal.examserver.entity.UserRole;
import com.examportal.examserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    //creating user
    @PostMapping("/")
    public User createUser(@RequestBody User user) throws Exception {

        Set<UserRole> roles = new HashSet<>();

        Role role = new Role();
        role.setRoleId(33L);
        role.setRoleName("NORMAL");

        UserRole userRole = new UserRole();
        userRole.setUser(user);
        userRole.setRole(role);
        roles.add(userRole);
        return this.userService.createUser(user, roles);
    }

    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") String username) {
        return this.userService.getUser(username);
    }
    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable("userId") Long UserId){
     this.userService.deleteUser(UserId);
    }
    //update

}


