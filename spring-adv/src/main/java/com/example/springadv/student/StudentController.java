package com.example.springadv.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {

    @GetMapping
    public List<Student> displayStudents() {
        return Arrays.asList(
                new Student(
                        1L,
                        "ABC",
                        "abc@email.com",
                        Gender.MALE
                ),
                new Student(
                        2L,
                        "DEF",
                        "def@email.com",
                        Gender.OTHERS
                )
        );
    }
}
