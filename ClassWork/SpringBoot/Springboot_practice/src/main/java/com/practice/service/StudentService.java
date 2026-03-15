package com.practice.service;

import com.practice.entity.Student;

public interface StudentService {
   

    void save(Student student);


    Student get(Integer id);

    void delete(Integer id);


}
