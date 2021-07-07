package com.cos.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogControllerTest {
	
	@GetMapping("/home")
	public String hello() {
		
		return "<h1>hello sping boot</h1>";
	}

}
