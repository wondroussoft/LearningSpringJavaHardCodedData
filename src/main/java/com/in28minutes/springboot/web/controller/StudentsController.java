package com.in28minutes.springboot.web.controller;
import com.in28minutes.springboot.web.model.Student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentsController {
	@RequestMapping(value = "/students", method = RequestMethod.GET)
	public String showStudentsListPage(ModelMap model) {
		List<Student> students = new ArrayList<Student>();

		students.add(new Student(1, "Amar", "Boy", "Nusery", "HSR Layout"));
		students.add(new Student(2, "Akbar", "Boy", "Nusery", "BTM Layout"));
		students.add(new Student(3, "Rani", "Girl", "Nusery", "ITI Layout"));
		students.add(new Student(4, "Noor", "Girl", "Nusery", "HBR Layout"));
		
		model.put("students", students);

		return "students";
	}

	@RequestMapping(value = "/students/{id}", method = RequestMethod.GET)
	public String showEditStudentPage(ModelMap model, @PathVariable(value = "id") int id) {
		Student student = null;

		if (id == 1) {
			student = new Student(1, "Amar", "Boy", "Nusery", "HSR Layout");
		} else if (id == 2) {
			student = new Student(2, "Akbar", "Boy", "Nusery", "BTM Layout");
		} else if (id == 3) {
			student = new Student(3, "Rani", "Girl", "Nusery", "ITI Layout");
		} else if (id == 4) {
			student = new Student(4, "Noor", "Girl", "Nusery", "HBR Layout");
		} 
		model.put("student", student);

		return "editstudent";
	}
	
	@RequestMapping(value = "/students/update/{id}", method = RequestMethod.POST)
	public String saveStudentPage(ModelMap model, @PathVariable(value = "id") int id, @RequestParam(value = "name") String name,
			@RequestParam(value = "sex") String sex, @RequestParam(value = "grade") String grade,
			@RequestParam(value = "address") String address) {
		
		String msg = "";
		List<Student> students = new ArrayList<Student>();

		if (id == 1) {
			msg = "Student 1 is Updated";
			students.add(new Student(id, name, sex, grade, address));
			students.add(new Student(2, "Akbar", "Boy", "Nusery", "BTM Layout"));
			students.add(new Student(3, "Rani", "Girl", "Nusery", "ITI Layout"));
			students.add(new Student(4, "Noor", "Girl", "Nusery", "HBR Layout"));
		} else if (id == 2) {
			msg = "Student 2 is Updated";
			students.add(new Student(1, "Amar", "Boy", "Nusery", "HSR Layout"));
			students.add(new Student(id, name, sex, grade, address));
			students.add(new Student(3, "Rani", "Girl", "Nusery", "ITI Layout"));
			students.add(new Student(4, "Noor", "Girl", "Nusery", "HBR Layout"));
		} else if (id == 3) {
			msg = "Student 3 is Updated";
			students.add(new Student(1, "Amar", "Boy", "Nusery", "HSR Layout"));
			students.add(new Student(2, "Akbar", "Boy", "Nusery", "BTM Layout"));
			students.add(new Student(id, name, sex, grade, address));
			students.add(new Student(4, "Noor", "Girl", "Nusery", "HBR Layout"));
		} else if (id == 4) {
			msg = "Student 4 is Updated";
			students.add(new Student(1, "Amar", "Boy", "Nusery", "HSR Layout"));
			students.add(new Student(2, "Akbar", "Boy", "Nusery", "BTM Layout"));
			students.add(new Student(3, "Rani", "Girl", "Nusery", "ITI Layout"));
			students.add(new Student(id, name, sex, grade, address));
		} 
		
		model.put("msg", msg);
		model.put("students", students);

		return "students";
	}
	
	@RequestMapping(value = "/students/update/{id}", method = RequestMethod.GET)
	public String saveStudentPage(ModelMap model) {
		
		return "student";
	}
	
	@RequestMapping(value = "/students/view/{id}", method = RequestMethod.GET)
	public String viewStudentPage(ModelMap model, @PathVariable(value = "id") int id) {
		Student student = null;

		if (id == 1) {
			student = new Student(1, "Amar", "Boy", "Nusery", "HSR Layout");
		} else if (id == 2) {
			student = new Student(2, "Akbar", "Boy", "Nusery", "BTM Layout");
		} else if (id == 3) {
			student = new Student(3, "Rani", "Girl", "Nusery", "ITI Layout");
		} else if (id == 4) {
			student = new Student(4, "Noor", "Girl", "Nusery", "HBR Layout");
		} 
		model.put("student", student);

		return "viewstudent";
	}
	
	@RequestMapping(value = "/students/delete/{id}", method = RequestMethod.GET)
	public String deleteStudent(ModelMap model, @PathVariable(value = "id") int id) {
		String msg = "";
		List<Student> students = new ArrayList<Student>();

		if (id == 1) {
			msg = "Student 1 is deleted";
			students.add(new Student(2, "Akbar", "Boy", "Nusery", "BTM Layout"));
			students.add(new Student(3, "Rani", "Girl", "Nusery", "ITI Layout"));
			students.add(new Student(4, "Noor", "Girl", "Nusery", "HBR Layout"));
			
		} else if (id == 2) {
			msg = "Student 2 is deleted";
			students.add(new Student(1, "Amar", "Boy", "Nusery", "HSR Layout"));
			students.add(new Student(3, "Rani", "Girl", "Nusery", "ITI Layout"));
			students.add(new Student(4, "Noor", "Girl", "Nusery", "HBR Layout"));
		} else if (id == 3) {
			msg = "Student 3 is deleted";
			students.add(new Student(1, "Amar", "Boy", "Nusery", "HSR Layout"));
			students.add(new Student(2, "Akbar", "Boy", "Nusery", "BTM Layout"));
			students.add(new Student(4, "Noor", "Girl", "Nusery", "HBR Layout"));
		} else if (id == 4) {
			msg = "Student 4 is deleted";
			students.add(new Student(1, "Amar", "Boy", "Nusery", "HSR Layout"));
			students.add(new Student(2, "Akbar", "Boy", "Nusery", "BTM Layout"));
			students.add(new Student(3, "Rani", "Girl", "Nusery", "ITI Layout"));
		}
		
		model.put("msg", msg);
		model.put("students", students);

		return "students";
	}
	
	@RequestMapping(value = "/student", method = RequestMethod.POST)
	public String saveStudent(ModelMap model, @RequestParam(value = "name") String name,
			@RequestParam(value = "sex") String sex, @RequestParam(value = "grade") String grade,
			@RequestParam(value = "address") String address) {
		
		String msg = "New Student is added with id as 5";
		List<Student> students = new ArrayList<Student>();

		students.add(new Student(1, "Amar", "Boy", "Nusery", "HSR Layout"));
		students.add(new Student(2, "Akbar", "Boy", "Nusery", "BTM Layout"));
		students.add(new Student(3, "Rani", "Girl", "Nusery", "ITI Layout"));
		students.add(new Student(4, "Noor", "Girl", "Nusery", "HBR Layout"));
				
		students.add(new Student(5, name, sex, grade, address));
		
		model.put("msg", msg);
		model.put("students", students);

		return "students";
	}

	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public String saveStudent(ModelMap model) {
		
		return "addstudent";
	}

	
}
