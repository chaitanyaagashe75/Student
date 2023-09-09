package com.example.Student.service.impl;

import com.example.Student.model.Student;
import com.example.Student.repository.StudentRepository;
import com.example.Student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;


    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> addAllStudent(List<Student> students) {
        return studentRepository.saveAll(students);
    }

    @Override
    public Student fetchStudent(int id) {
        Optional<Student> OptStudent = studentRepository.findById(id);
        if (OptStudent.isPresent()) {
            return OptStudent.get();
        }else{
            return null;
        }
    }

    @Override
    public List<Student> fetchAllStudent() {
        return studentRepository.findAll();
    }


}
