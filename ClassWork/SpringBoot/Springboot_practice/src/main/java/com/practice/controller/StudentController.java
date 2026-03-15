package com.practice.controller;

import com.practice.entity.Student;
import com.practice.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    @PostMapping("/save")
    public String saveStudents(@RequestBody Student student)
    {
        studentService.save(student);
        return "Students details saved";
    }
    @GetMapping ("/getAllStudent/{id}")
    public Student getAllStudents(@PathVariable Integer id)
    {
        studentService.get(id);
        return studentService.get(id);

    }
    @DeleteMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable Integer id)
    {
        studentService.delete(id);
    return "student deleted ";
    }

}
