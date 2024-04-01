package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Address;
import com.nt.entity.Student;
import com.nt.reopository.StudentRepository;

@Service
public class StudentAddressService {

	@Autowired
	private StudentRepository studrepo;

	public String saveStudent() {
		
		Student st=new Student();
		//st.setStudentId(15);
		st.setStudentName("ajay");
		st.setAbout("good student");
		
		
		Address a1=new Address();
		
		a1.setAddressId(16);
		a1.setStreat("location");
		a1.setCity("prayagraj");
		a1.setCountry("india");
		a1.setStudent(st);
		
		
        Address a2=new Address();
		
		a2.setAddressId(17);
		a2.setStreat("villege");
		a2.setCity("banaras");
		a2.setCountry("india");
		a2.setStudent(st);

		
		List<Address> addresslist=new ArrayList<>();
		
		addresslist.add(a1);
		addresslist.add(a2);
		
		st.setAddresslist(addresslist);

		Student stu = studrepo.save(st);
		
		return "data is saved"+stu.getStudentId();
	} 
	
	
	
}
