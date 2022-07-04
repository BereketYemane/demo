package com.Jenkins.Service;

import com.Jenkins.Domain.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    public Student getStudent() {
        return new Student("Bereket", "612749", 25);

    }
}
