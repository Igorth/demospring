package com.github.igordiasth.demoSpring.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Igor",
                        "igordiasth@gmail.com",
                        LocalDate.of(2000, Month.AUGUST, 21),
                        20
                )
        );
    }
}
