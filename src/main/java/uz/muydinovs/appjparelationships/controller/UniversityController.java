package uz.muydinovs.appjparelationships.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uz.muydinovs.appjparelationships.entity.University;
import uz.muydinovs.appjparelationships.payload.UniversityDto;
import uz.muydinovs.appjparelationships.repository.UniversityRepository;
import uz.muydinovs.appjparelationships.service.UniversityService;

import java.util.List;

@RestController()
public class UniversityController {

    @Autowired
    UniversityService universityService;

    @Autowired
    UniversityRepository universityRepository;

    @RequestMapping(value = "/university", method = RequestMethod.GET)
    public List<University> getUniversities() {
        return universityRepository.findAll();
    }

    @RequestMapping(value = "/university/{id}", method = RequestMethod.GET)
    public University getUniversities(@PathVariable("id") Integer id) {
        return universityRepository.getUniversityById(id);
    }


    @RequestMapping(value = "/university", method = RequestMethod.POST)
    public String addUniversity(@RequestBody UniversityDto universityDto) {
        universityService.addUniversity(universityDto);
        return "University added successfully";
    }

    @RequestMapping(value = "/university/{id}", method = RequestMethod.PUT)
    public String updateUniversity(@RequestBody UniversityDto universityDto, @PathVariable("id") Integer id) {
        return universityService.updateUniversity(universityDto,id);
    }

    @RequestMapping(value = "/university/{id}", method = RequestMethod.DELETE)
    public String deleteUniversityById(@PathVariable("id") Integer id) {
        return universityRepository.deleteUniversityById(id) ? "University deleted successfully" : "University deletion failed";
    }
}
