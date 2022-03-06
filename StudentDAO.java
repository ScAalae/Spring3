package app.dao;

import java.util.List;

import app.pojo.Student;

   public interface StudentDAO {
	int create(Student student);
	
     	List<Student> read();

	 List<Student> findStudentById(int studentId);

	 int update(Student student);

	int delete(int studentId);	
}
