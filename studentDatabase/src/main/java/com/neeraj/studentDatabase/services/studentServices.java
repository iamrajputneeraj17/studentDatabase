package com.neeraj.studentDatabase.services;


import com.neeraj.studentDatabase.entity.Student;
import com.neeraj.studentDatabase.repository.studentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class studentServices {

    @Autowired
    studentRepository repo;

    public Student create(Student student) {
        return repo.save(student);
    }
}
