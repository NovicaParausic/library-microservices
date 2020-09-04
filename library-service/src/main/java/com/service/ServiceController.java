package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

	@Autowired
	private ConfigModel configModel;
	
	@GetMapping
	public String getString() {
		return "bla " + configModel.getMinBalance() + " " + configModel.getMaxBalance();
	}
}
