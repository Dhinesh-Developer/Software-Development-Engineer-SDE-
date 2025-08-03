package com.arise.sb.service;

import com.arise.sb.entity.Student;
import com.arise.sb.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(int rno) {
        return Optional.ofNullable(studentRepository.findById(rno).orElseThrow(() -> new RuntimeException("Stduent Not Found")));
    }

    public void createStudent(String name,String technology) {
        Student student = new Student(name,technology);
         studentRepository.save(student);
    }

    public void updateStudent(Student student) {

        Student existingStudent = studentRepository.findById(student.getRno())
                .orElseThrow(() -> new RuntimeException("Student not found"));

        existingStudent.setName(student.getName());
        existingStudent.setTechnology(student.getTechnology());
        studentRepository.save(existingStudent);
    }

    public String deleteStudent(int rno) {
        Student student = studentRepository.findById(rno).orElseThrow(() -> new RuntimeException("Student not found"));
        studentRepository.deleteById(rno);
        return "student deleted";
    }
}
