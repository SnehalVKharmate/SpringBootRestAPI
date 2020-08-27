package com.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.main.model.Student;

@Repository
public interface HRepository extends CrudRepository<Integer, Student> {

	
	@Query("from Student where Username=:username and Password=:password")
  List<Student> getAll();
	
	
}
