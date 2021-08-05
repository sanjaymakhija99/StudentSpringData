package com.example.crazyengg.spring.data.tutorial;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.crazyengg.spring.data.tutorial.entity.Guardian;
import com.example.crazyengg.spring.data.tutorial.entity.Student;
import com.example.crazyengg.spring.data.tutorial.repository.StudentRepository;

@SpringBootTest
class SpringDataTutorialApplicationTests {
	
	@Autowired
	StudentRepository studentRepository;

	@Test
	public void saveStudent() {
		
		Guardian guardian = Guardian.builder().name("kanchan").mobile("9730560677").build();
		Student student = Student.builder().firstName("rohit").lastName("jawaharani")
		.emailId("rohit@gmail.com").guardian(guardian ).build();
		
		studentRepository.save(student);
		
	}
	
	@Test 
	public void findAll() {
		
		List<Student> studentList = studentRepository.findAll();
		System.out.println(studentList);
	}

}
