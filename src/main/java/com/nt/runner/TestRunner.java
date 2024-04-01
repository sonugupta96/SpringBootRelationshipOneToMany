package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.StudentAddressService;

@Component
public class TestRunner implements CommandLineRunner {

	
	@Autowired
	private StudentAddressService stuservice;
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		String saveStudent = stuservice.saveStudent();
		
		System.out.println(saveStudent);
		
	}

}
