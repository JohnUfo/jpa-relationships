package uz.muydinovs.appjparelationships.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import uz.muydinovs.appjparelationships.entity.Faculty;
import uz.muydinovs.appjparelationships.entity.University;
import uz.muydinovs.appjparelationships.repository.FacultyRepository;
import uz.muydinovs.appjparelationships.repository.UniversityRepository;

import java.util.List;

@RestController()
public class FacultyController {

    @Autowired
    FacultyRepository facultyRepository;

    @RequestMapping(value = "/faculty", method = RequestMethod.GET)
    public List<Faculty> getAllFaculty() {
        return facultyRepository.findAll();
    }
}
