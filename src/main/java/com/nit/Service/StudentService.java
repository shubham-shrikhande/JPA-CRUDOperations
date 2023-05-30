package com.nit.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.Entity.Student;
import com.nit.repo.IRepository;

@Service
public class StudentService{

	@Autowired
	IRepository repoS;
	
	public String saveStudent(Student student) {
		Student msg=repoS.save(student);
		return msg+"Student saved successfully";
	}

}
