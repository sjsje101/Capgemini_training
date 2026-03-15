package com.practice.service.impl;

import com.practice.entity.Student;
import com.practice.repository.StudentRepository;
import com.practice.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;


    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Student get(Integer id) {
        return studentRepository.findById(id).orElse(null);

    }

    @Override
    public void delete(Integer id) {
        studentRepository.deleteById(id);
    }

}
