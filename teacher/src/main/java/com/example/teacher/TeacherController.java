package com.example.teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping(value="Teacher")
@CrossOrigin("*")
public class TeacherController {

    @Autowired
    ITeacherServices teacherServ;

    @PostMapping(value="/addTeacher")
    public void addTeacher(@RequestBody Teacher t) {
        teacherServ.AddTeacher(t);
    }
    @PutMapping(value="/UpadteTeacher")
    public void updateTeacher(@RequestBody Teacher t) {
        teacherServ.UpdateTeacher(t);
    }

    @DeleteMapping(value = "/DeleteTeacher/{idTeacher}")
    public void deleteTeacher(@PathVariable ("idTeacher") Long idTeacher) {
        teacherServ.DeleteTeacher(idTeacher);
    }

    @GetMapping(value = "/GetTeacher")
    public List<Teacher> GetAllTeacher()
    {
        List<Teacher> t = teacherServ.GetAllTeacher();
        return t;
    }





}
