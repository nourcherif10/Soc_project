package com.example.student;

import java.util.List;

public interface IStudentServices {
    void AddStudent(Student s);

    void UpdateStudent(Student s);


    void DeleteStudent(Long idStudent);

    List<Student> GetAllStudent();

}
