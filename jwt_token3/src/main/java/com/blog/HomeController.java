package com.blog;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

	@Autowired
	UserService userService;
	
	@GetMapping("/user")
	public List<User> getUser() {
		System.out.print("getting user");
		return this.userService.getStore();
	}
	@GetMapping ("/current-user")
	public String getLoggedInUser(Principal principal )
	{
		return principal.getName();
	}
	
}
