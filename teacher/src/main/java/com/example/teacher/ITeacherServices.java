package com.example.teacher;

import java.util.List;

public interface ITeacherServices {
    void AddTeacher(Teacher t);

    void UpdateTeacher(Teacher t);


    void DeleteTeacher (Long idTeacher);

    List<Teacher> GetAllTeacher();

}
