package com.examportal.examserver;

import com.examportal.examserver.entity.Role;
import com.examportal.examserver.entity.User;
import com.examportal.examserver.entity.UserRole;
import com.examportal.examserver.service.UserService;
import org.hibernate.dialect.MySQLDialect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ExamserverApplication implements CommandLineRunner {
	@Autowired
	private UserService userservice;

	public static void main(String[] args) {
		SpringApplication.run(ExamserverApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("starting code");

//		User user = new User();
//	    user.setFirstName("Nilam");
//		user.setLastName("Chourasiya");
//		user.setUsername("Nilam1999");
//		user.setEmail("nilamchourasiya6@gmail.com");
//		user.setPassword("Chourasiya@1999");
//		user.setProfile("default.png");


//		Role role1 = new Role();
//		role1.setRoleId(33);
//		role1.setRoleName("ADMIN");
//
//		Set<UserRole> userRoleSet = new HashSet<>();
//		UserRole userRole = new UserRole();
//		userRole.setRole(role1);
//		userRole.setUser(user);
//		userRoleSet.add(userRole);
//
//		User user1=this.userservice.createUser(user,userRoleSet);
		//System.out.println(user1.getUsername());
	}
}
