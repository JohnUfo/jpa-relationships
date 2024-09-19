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

    @GetMapping
    public List<Faculty> getFaculties() {
        return facultyRepository.findAll();
    }

    @GetMapping(value = "/byUniversityId/{universityId}")
    public List<Faculty> getFacultiesByUniversityId(@PathVariable Integer universityId) {
        return facultyRepository.getFacultiesByUniversityId(universityId);
    }

    @PostMapping
    public String addFaculty(@RequestBody FacultyDto facultyDto) {
        return facultyService.addFaculty(facultyDto);
    }


}
