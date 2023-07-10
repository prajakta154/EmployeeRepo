package com.main.cjc.model.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.main.cjc.model.Employee;
import com.main.cjc.model.service.HomeService;

public class HomeController {
	@Autowired
	HomeService hs;
	
	@PostMapping("/savedata")
	public Employee savedata(@RequestBody Employee e) {
		return hs.savedata(e);
	}

}
