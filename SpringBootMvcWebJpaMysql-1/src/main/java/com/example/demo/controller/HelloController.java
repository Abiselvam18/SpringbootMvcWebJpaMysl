package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.StudentRepo;
import com.example.demo.model.Student_Web;
@Controller
public class HelloController {
	@Autowired
	StudentRepo repo;

	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}

	@RequestMapping("/addStudent")
	public String addStudent(Student_Web student) {
		repo.save(student);
		return "home.jsp";
	}
}
