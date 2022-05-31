package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Login;
import com.service.AppService;

@RestController
public class AppController {
	
	@Autowired
	private AppService appService;
		
	@PostMapping(value = "/register", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public String createAccount(@RequestBody Login login) {
		String result = appService.register(login);
		return result;
	}
	
	@PostMapping(value = "/verify", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public String verifyAccount(@RequestBody Login login) {
		String result = appService.verifyPassword(login);
		System.out.println(result);
		return result;
	}
	
//	@PostMapping("/withdraw/{accId}/{amount}")
//	public void withdraw(@PathVariable("accId") String accountId, @PathVariable("amount") double amount) {
//		appService.withdraw(accountId, amount);		
//	}
//	
//	@PostMapping("/deposit/{accId}/{amount}")
//	public void deposit(@PathVariable("accId") String accountId, @PathVariable("amount") double amount) {
//		appService.deposit(accountId, amount);		
//	}
//	
//	@GetMapping("/checkBalance/{accId}")
//	public double checkBalance(@PathVariable("accId")String accountId) {		
//		return appService.checkBalance(accountId);	
//		
//	}

}
