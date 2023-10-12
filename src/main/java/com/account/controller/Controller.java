package com.account.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class Controller {

	//   /account/message
	@GetMapping("/message")
	public String getMessage() {
		return "How are you";
	}
}
