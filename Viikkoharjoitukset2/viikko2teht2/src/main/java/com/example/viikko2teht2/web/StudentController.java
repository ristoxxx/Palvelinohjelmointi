package com.example.viikko2teht2.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.viikko2teht2.domain.Student;

@Controller
public class StudentController {
	@RequestMapping(value="/hello")
	public String students(Model model) {
		List<Student> students= new ArrayList<>();
        
		Student eka = new Student("Kate", "Perry");
		Student toka = new Student("Pete", "Carry");
		Student kolmas = new Student("Atte", "Pera");
		
		students.add(eka);
		students.add(toka);
		students.add(kolmas);
		
		model.addAttribute("students", students);
		return "studentlist";
	}

}
