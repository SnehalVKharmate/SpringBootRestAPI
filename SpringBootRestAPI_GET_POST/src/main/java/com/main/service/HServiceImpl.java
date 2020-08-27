package com.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.model.Student;
import com.main.repository.HRepository;
import com.main.service.HService;

@Service
public class HServiceImpl implements HService {

	@Autowired
	HRepository hr;



	@Override
	public Student savedata(Student s) {
		
		return hr.save(s);
	}

	@Override
	public List<Student> getAllData() {
		
		return (List<Student>) hr.findAll();
	}

	@Override
	public List<Student> loginCheck(String username, String password) {
		
		//return hr.findAllByUsernameAndPassword(username,password);
		//hr.findAllByUsernameAndPassword(username,password);
		return (List<Student>) hr.getAll();
	}

		
}
