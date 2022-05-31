package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Login;
import com.repository.AppDao;

@Service
public class AppService {

	@Autowired
	private AppDao appDao;

	public String register(Login login) {
		appDao.save(login);
		return "Registered Sucessfully";
	}

	public String verifyPassword(Login login) {
		
		String result = null;

		String userEnteredPass = login.getPassword();
		
		System.out.println(userEnteredPass);
		
		Optional<Login> optional = appDao.findById(login.getUserName());

		String retrievedPassword = optional.get().getPassword();
		
		System.out.println(retrievedPassword);

		if (!userEnteredPass.equals(retrievedPassword)) {
			result = "Unsucessfull";
		}else {
			result = "Sucessfull";
		}
		return result;
	}

}
