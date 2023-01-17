package com.example.teacher;

import org.hibernate.engine.spi.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TeacherServices implements  ITeacherServices{

    @Autowired
    TeacherRepository TeacherRepo;



    public void addTeacher(Teacher t) {
        // TODO Auto-generated method stub
        TeacherRepo.save(t);
    }


    @Override
    public void AddTeacher(Teacher t) {
        TeacherRepo.save(t);
    }

    public void UpdateTeacher(Teacher t) {
        // TODO Auto-generated method stub
        TeacherRepo.save(t);
    }


    public void DeleteTeacher(Long idTeacher) {
        // TODO Auto-generated method stub
        TeacherRepo.deleteById(idTeacher);

    }


    public List<Teacher> GetAllTeacher() {
        // TODO Auto-generated method stub
        List<Teacher> t =TeacherRepo.findAll();
        return t;
    }



}
