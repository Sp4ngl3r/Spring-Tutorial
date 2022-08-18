package com.workspace.tutorial.config;

import com.workspace.tutorial.model.Student;
import com.workspace.tutorial.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student random1 = new Student(
                    "Random1",
                    "random1@email.com",
                    LocalDate.of(2000, Month.APRIL, 1)
            );

            Student random2 = new Student(
                    "Random2",
                    "random2@email.com",
                    LocalDate.of(2002, Month.JULY, 12)
            );

            studentRepository.saveAll(List.of(random1, random2));
        };
    }
}
