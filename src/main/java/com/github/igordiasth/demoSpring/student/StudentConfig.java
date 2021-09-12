package com.github.igordiasth.demoSpring.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student igor = new Student(
                    "Igor",
                    "igordiasth@gmail.com",
                    LocalDate.of(2000, Month.AUGUST, 21)
            );

            Student laisa = new Student(
                    "Laisa",
                    "laisa@gmail.com",
                    LocalDate.of(1988, Month.OCTOBER, 5)
            );

            repository.saveAll(
                    List.of(igor, laisa)
            );
        };
    }
}
