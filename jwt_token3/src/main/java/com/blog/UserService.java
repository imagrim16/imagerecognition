package com.blog;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Service
public class UserService {

	List<User> store=new ArrayList<>();
	
	public UserService()
	{
		store.add(new User(UUID.randomUUID().toString(),"Agrim Jain","agrimreg@gmail.com"));
		
		store.add(new User(UUID.randomUUID().toString(),"Naman Jain","agrimreg@gmail.com"));
		
		store.add(new User(UUID.randomUUID().toString(),"Ayush Jain","agrimreg@gmail.com"));
		
	}
}
