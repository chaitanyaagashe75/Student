package com.example.Student.controller;

import com.example.Student.model.Student;
import com.example.Student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @PostMapping("/addAll")
    public List<Student> addAllStudent(@RequestBody List<Student> students){
        return studentService.addAllStudent(students);
    }

    @GetMapping("/get/{id}")
    public Student fetchStudent(@PathVariable int id){
        return studentService.fetchStudent(id);
    }

    @GetMapping("/getAll")
    public List<Student> fetchAllStudent(){
        return studentService.fetchAllStudent();
    }

    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/delete")
    public Student deleteStudent(@RequestParam int id){
        return studentService.deleteStudent(id);
    }



}
