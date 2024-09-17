package uz.muydinovs.appjparelationships.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import uz.muydinovs.appjparelationships.entity.University;
import uz.muydinovs.appjparelationships.repository.UniversityRepository;

import java.util.List;

@RestController()
public class UniversityController {

    @Autowired
    UniversityRepository universityRepository;

    @RequestMapping(value = "/university",method = RequestMethod.GET)
    public List<University> getUniversities() {
        return universityRepository.findAll();
    }
}
