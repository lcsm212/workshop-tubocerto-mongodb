package com.tubocerto.workshop.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.tubocerto.workshop.domain.User;
import com.tubocerto.workshop.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		
		User Luiz = new User(null, "luiz Claudio", "luiz.marzola@tubocerto.com", "975508268", "123456", "1");
		User Mario = new User(null, "Mario", "mario@tubocerto.com", "999999999", "123", "1");
		User bob = new User(null, "Bob Grey", "bob@gmail.com", "900000000", "1234", "2");
		
		userRepository.saveAll(Arrays.asList(Luiz, Mario, bob));
	}

}
