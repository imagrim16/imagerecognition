package com.blog;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

	private String userId;
	private String name;
	private String email;
	
	
}
