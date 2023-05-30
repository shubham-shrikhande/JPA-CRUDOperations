package com.nit.runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.nit.Service.StudentService;
import com.nit.Entity.*;
public class StudentRunner implements CommandLineRunner {

	@Autowired
	StudentService service;
	@Override
	public void run(String... args) throws Exception {

		Scanner sc= new Scanner(System.in);

		System.out.println("Enter Name");
		String name=sc.next();
		System.out.println("Enter resumePath");
		String resume=sc.next();
		System.out.println("Enter photoPath");
		String photo=sc.next();

		Reader reader=new FileReader(resume);
		File file=new File(resume);
		char[] resumeContent=new char[(int)file.length()];
		reader.read(resumeContent);

		InputStream is=new FileInputStream(photo);
		byte[] photoContent=new byte[is.available()];
		photoContent=is.readAllBytes();

		Student student=new Student( name,resumeContent,photoContent);
		String msg=service.saveStudent(student);
		System.out.println(msg);
	}

}
