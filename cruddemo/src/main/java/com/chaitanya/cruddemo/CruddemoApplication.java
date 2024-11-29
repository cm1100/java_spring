package com.chaitanya.cruddemo;

import com.chaitanya.cruddemo.dao.StudentDao;
import com.chaitanya.cruddemo.entity.Student;
import org.hibernate.dialect.SybaseDialect;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDao studentDao){
		return runner->{
			createStudentDao(studentDao);
			//createMultipleStudents(studentDao);
			//readStudent(studentDao);
			//queryForStudents(studentDao);
			//updateStudent(studentDao);
			//deleteStudend(studentDao);
			
		};

	}

	private void deleteStudend(StudentDao studentDao) {
		studentDao.delete(1L);
		System.out.println("student deleted");
	}

	private void updateStudent(StudentDao studentDao) {
		Long studId = 1L;

		Student myStudent = studentDao.findById(studId);
		System.out.println(myStudent);

		System.out.println("Updating stud");

		myStudent.setFirstName("raj");

		studentDao.update(myStudent);
		System.out.println(myStudent);

	}

	private void queryForStudents(StudentDao studentDao) {
		List<Student> theStudents = studentDao.findAll();
		for(Student tempStudent:theStudents){
			System.out.println(tempStudent);
		}
	}

	private void readStudent(StudentDao studentDao) {
		System.out.println("Creating new student");
		Student tempStudent = new Student("cm2","malik","avs@g.com");
		studentDao.save(tempStudent);

		Long theId = tempStudent.getId();
		System.out.println("id is " +  theId);

		Student myStudent = studentDao.findById(theId);

		System.out.println(myStudent);



	}

	private void createMultipleStudents(StudentDao studentDao) {
		

	}

	private void createStudentDao(StudentDao studentDao) {
		System.out.println("Creating student object");
		Student tempStudent = new Student("Chaitanya","Malik","timeisgod12@gmail.com");

		System.out.println("saving the object");

		studentDao.save(tempStudent);

		System.out.println("Generated student id "+tempStudent.getId());
	}


}
