package com.example.Student.service.impl;

import com.example.Student.model.Student;
import com.example.Student.repository.StudentRepository;
import com.example.Student.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
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

    @Override
    public Student updateStudent(Student student) {
        Optional<Student> OptStudent = studentRepository.findById(student.getId());
        if(OptStudent.isPresent()){
           Student student1= OptStudent.get();
           student1.setName(student.getName());
           student1.setSurname(student.getSurname());
           student1.setCity(student.getCity());
           student1.getPhoneNumber(student.getPhoneNumber());
            return student1;
        }else{
            log.info("student not found");
            return null;
        }
    }

    @Override
    public Student deleteStudent(Student student) {
        Optional<Student> OptStudent = studentRepository.findById(student.getId());
        if(OptStudent.isPresent()){
            Student student1= OptStudent.get();
            log.info("Student deleted Successfully");
            return student1;
        }else{
            log.info("Student not found in the Database");
            return null;
        }
    }


}
