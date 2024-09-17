package uz.muydinovs.appjparelationships.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uz.muydinovs.appjparelationships.entity.Faculty;
import uz.muydinovs.appjparelationships.entity.Faculty;
import uz.muydinovs.appjparelationships.payload.FacultyDto;
import uz.muydinovs.appjparelationships.repository.FacultyRepository;
import uz.muydinovs.appjparelationships.repository.FacultyRepository;
import uz.muydinovs.appjparelationships.service.FacultyService;

import java.util.List;

@RestController()
public class FacultyController {

    @Autowired
    FacultyRepository facultyRepository;

    @Autowired
    FacultyService facultyService;

    @RequestMapping(value = "/faculty", method = RequestMethod.GET)
    public List<Faculty> getFaculties() {
        return facultyRepository.findAll();
    }

    @RequestMapping(value = "/faculty/{id}", method = RequestMethod.GET)
    public Faculty getFacultyById(@PathVariable Integer id) {
        return facultyRepository.getFacultyById(id);
    }

    @RequestMapping(value = "/faculty", method = RequestMethod.POST)
    public String addFaculty(@RequestBody FacultyDto facultyDto) {
        return facultyService.addFaculty(facultyDto);
    }

    @RequestMapping(value = "/faculty/{id}", method = RequestMethod.PUT)
    public String addFaculty(@RequestBody FacultyDto facultyDto, @PathVariable("id") Integer id) {
        return facultyService.updateFaculty(facultyDto, id);
    }
}
