package com.Jenkins.Service;

import com.Jenkins.Domain.Student;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringJUnit4ClassRunner.class)
class StudentServiceTest {


    @Test
    void getStudent() {
        Student expected = Student.builder().name("Bereket").studentID("612749").age(25).build();
        StudentService studentService = new StudentService();
        Student result = studentService.getStudent();
        assertEquals(expected, result);
        ;

    }
}