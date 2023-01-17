package com.example.course;

import java.util.List;

public interface ICourseService {

        void AddCourse(Course c);

        void Updatecourse(Course c);


        void DeleteCourse (Long idCourse);

        List<Course> GetAllCourse();
}
