package com.tubocerto.workshop.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tubocerto.workshop.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {
	List<User> list = new ArrayList<>();
		User Luiz = new User("1", "Luiz Claudio", "luiz.marzola@tubocerto.com", "975508268", "123456", "1");
		User Mario = new User("2", "Mario", "marioa@tubocerto.com", "999999999", "123", "1");
		list.addAll(Arrays.asList(Luiz, Mario));
		return ResponseEntity.ok().body(list);
	}

}
