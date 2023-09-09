package com.example.Student.service;

import com.example.Student.model.Student;

import java.util.List;

public interface StudentService {
   public Student addStudent(Student student);

   public List<Student> addAllStudent(java.util.List<com.example.Student.model.Student> students);

  public Student fetchStudent(int id);

   public List<Student> fetchAllStudent();

   public Student updateStudent(Student student);

   public Student deleteStudent(int id);
}
