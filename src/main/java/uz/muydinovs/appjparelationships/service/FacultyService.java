package uz.muydinovs.appjparelationships.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.muydinovs.appjparelationships.entity.Faculty;
import uz.muydinovs.appjparelationships.entity.University;
import uz.muydinovs.appjparelationships.payload.FacultyDto;
import uz.muydinovs.appjparelationships.repository.FacultyRepository;
import uz.muydinovs.appjparelationships.repository.UniversityRepository;

@Service
public class FacultyService {

    @Autowired
    FacultyRepository facultyRepository;

    @Autowired
    UniversityRepository universityRepository;

    public String updateFaculty(FacultyDto facultyDto, Integer id) {

        return "Faculty not found!";
    }

    public String addFaculty(FacultyDto facultyDto) {
        University university = universityRepository.getUniversityById(facultyDto.getUniversityId());
        facultyRepository.save(new Faculty(facultyDto.getName(), university));
        return "Faculty added successfully";
    }
}
