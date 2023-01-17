package com.example.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping(value="Student")
public class StudentController {
    @Autowired
    IStudentServices studentServ;

    @PostMapping(value="/add")
    public void addTeacher(@RequestBody Student s) {
        studentServ.AddStudent(s);
    }
    @PutMapping(value="/UpadteStudent")
    public void updateTeacher(@RequestBody Student s) {
        studentServ.UpdateStudent(s);
    }

    @DeleteMapping(value = "/DeleteStudent/{idstd}")
    public void deleteTeacher(@PathVariable ("idstd") Long idstd) {
        studentServ.DeleteStudent(idstd);
    }

    @GetMapping(value = "/GetStudent")
    public List<Student> GetAllTeacher()
    {
        List<Student> s = studentServ.GetAllStudent();
        return s;
    }
}
