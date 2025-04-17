package com.example.demo.teste;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository repository;
	
	
	@GetMapping("/")
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping("/testeBanco")
	public String testeBanco(){
		User user = new User();
		user.setName("teste");
		repository.save(user);
		return "Usuario criado!";
	}

}
