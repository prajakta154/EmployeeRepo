package com.main.cjc.model.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.cjc.model.Employee;
import com.main.cjc.model.repository.HomeRepository;
import com.main.cjc.model.service.HomeService;
@Service
public class HomeServiceImpl implements HomeService {
	@Autowired
	HomeRepository hr;

	@Override
	public Employee savedata(Employee e) {
		// TODO Auto-generated method stub
		return hr.save(e);
	}

}
