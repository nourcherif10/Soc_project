package com.example.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class CourseController {
    @Autowired
    ICourseService CourseServ;

    @PostMapping(value="/addCourse")
    public void addTeacher(@RequestBody Course c) {
        CourseServ.AddCourse(c);
    }
    @PutMapping(value="/UpadteTeacher")
    public void updateTeacher(@RequestBody Course c) {
        CourseServ.Updatecourse(c);
    }

    @DeleteMapping(value = "/DeleteCourse/{idCourse}")
    public void deleteTeacher(@PathVariable ("idCourse") Long idCourse) {
        CourseServ.DeleteCourse(idCourse);
    }

    @GetMapping(value = "/GetCourse")
    public List<Course> GetAllTeacher()
    {
        List<Course> c = CourseServ.GetAllCourse();
        return c;
    }


}
