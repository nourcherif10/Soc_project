package com.example.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService implements IStudentServices{
    @Autowired
    StudentRepository StudentRepo;
    @Override
    public void AddStudent(Student s) {
        StudentRepo.save(s);

    }

    @Override
    public void UpdateStudent(Student s) {
        StudentRepo.save(s);

    }

    @Override
    public void DeleteStudent(Long idStudent) {
        StudentRepo.deleteById(idStudent);

    }

    @Override
    public List<Student> GetAllStudent() {
        List<Student> s =StudentRepo.findAll();
        return s;

    }
}
