package com.main.service;

import java.util.List;


import com.main.model.Student;


public interface HService {

	public Student savedata(Student s);
	public List<Student> loginCheck(String username,String password);
	public List<Student> getAllData();
}
