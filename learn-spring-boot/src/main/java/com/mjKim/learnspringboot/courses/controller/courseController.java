package com.mjKim.learnspringboot.courses.controller;

import java.util.Arrays;
import java.util.List;
import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mjKim.learnspringboot.courses.bean.Course;

@RestController
public class courseController {

	//http://localhost:8000/courses
	@GetMapping("/courses")
	public List<Course> getAllCourses(){
		List<Course> courses = new ArrayList<>();
        courses.add(new Course(1, "Learn Microservices", "in28minutes"));
        return courses;
	}
}
