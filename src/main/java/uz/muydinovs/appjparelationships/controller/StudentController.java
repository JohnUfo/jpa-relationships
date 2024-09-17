package uz.muydinovs.appjparelationships.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import uz.muydinovs.appjparelationships.entity.Student;
import uz.muydinovs.appjparelationships.repository.StudentRepository;

import java.util.List;

@RestController()
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
