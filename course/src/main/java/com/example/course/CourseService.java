package com.example.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService implements ICourseService {
    @Autowired
    CourseRepository CourseRepo;
    @Override
    public void AddCourse(Course c) {
        CourseRepo.save(c);

    }

    @Override
    public void Updatecourse(Course c) {
        CourseRepo.save(c);

    }

    @Override
    public void DeleteCourse(Long idCourse) {
        CourseRepo.deleteById(idCourse);

    }

    @Override
    public List<Course> GetAllCourse() {
        List<Course> c= CourseRepo.findAll();
        return c;
    }
}
