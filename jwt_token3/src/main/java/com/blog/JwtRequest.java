package com.blog;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JwtRequest {

	private String email;
	
	private String password;
}
