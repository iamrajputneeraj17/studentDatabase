package com.neeraj.studentDatabase.repository;

import com.neeraj.studentDatabase.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentRepository extends JpaRepository<Student, Integer> {
}
