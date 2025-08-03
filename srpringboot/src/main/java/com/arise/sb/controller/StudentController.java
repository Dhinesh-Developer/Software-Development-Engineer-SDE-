package com.arise.sb.controller;

import com.arise.sb.entity.Student;
import com.arise.sb.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getAllStudents(){
       return new ResponseEntity<>(studentService.getStudents(),HttpStatus.FOUND);
    }

    @GetMapping("/students/{rno}")
    public ResponseEntity<Optional<Student>> getStudentsById(@PathVariable int rno){
        return new ResponseEntity<>(studentService.getStudentById(rno),HttpStatus.FOUND);
    }

    @PostMapping("/students")
    public ResponseEntity<String> addStudent(@RequestParam("name") String name,@RequestParam("technology") String technology){
         studentService.createStudent(name,technology);
            return new ResponseEntity<>("student Added", HttpStatus.CREATED);
    }

    @PutMapping("/students")
    public ResponseEntity<String> updateStudent(@RequestBody Student student){
        studentService.updateStudent(student);
        return new ResponseEntity<>("student updated successfully",HttpStatus.OK);
    }

    @DeleteMapping("/students/{rno}")
    public ResponseEntity<String> deleteMapping(@PathVariable int rno){
        return new ResponseEntity<>(studentService.deleteStudent(rno),HttpStatus.OK);
    }

}
