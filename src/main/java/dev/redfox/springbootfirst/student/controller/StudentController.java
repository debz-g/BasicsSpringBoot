package dev.redfox.springbootfirst.student.controller;

import dev.redfox.springbootfirst.student.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    @GetMapping
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Debz",
                        "debz@gmail.com",
                        LocalDate.of(2002, Month.JANUARY,18),
                        21
                )
        );
    }
}
