package uz.muydinovs.appjparelationships.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import uz.muydinovs.appjparelationships.entity.University;
import uz.muydinovs.appjparelationships.payload.UniversityDto;
import uz.muydinovs.appjparelationships.repository.UniversityRepository;
import uz.muydinovs.appjparelationships.service.UniversityService;

import java.util.List;

@RestController()
public class UniversityController {
    @Autowired
    UniversityService universityService;
    UniversityRepository universityRepository;

    @RequestMapping(value = "/university", method = RequestMethod.GET)
    public List<University> getUniversities() {
        return universityRepository.findAll();
    }

    @RequestMapping(value = "/university", method = RequestMethod.POST)
    public String addUniversity(@RequestBody UniversityDto universityDto) {
        universityService.addUniversity(universityDto);
        return "University added successfully";
    }
}
