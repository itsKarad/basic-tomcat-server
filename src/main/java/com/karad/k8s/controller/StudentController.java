package com.karad.k8s.controller;

import com.karad.k8s.model.Student;
import com.karad.k8s.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentsService;

    @GetMapping("/")
    public List<Student> getAllStudents() {
        return studentsService.getAllStudents();
    }

    @GetMapping("/{studentId}")
    public Student getStudentById(@PathVariable("studentId") Long studentId) {
        return studentsService.getStudentById(studentId);
    }

    @PostMapping("/")
    public void addStudent(@RequestBody Student student) {
        studentsService.saveStudent(student);
    }

    @DeleteMapping("/{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentId) {
        studentsService.deleteStudent(studentId);
    }

}