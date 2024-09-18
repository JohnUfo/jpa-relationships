package uz.muydinovs.appjparelationships.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.muydinovs.appjparelationships.entity.Faculty;
import uz.muydinovs.appjparelationships.entity.University;
import uz.muydinovs.appjparelationships.payload.FacultyDto;
import uz.muydinovs.appjparelationships.repository.FacultyRepository;
import uz.muydinovs.appjparelationships.repository.UniversityRepository;

import java.util.Optional;

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
        boolean exists = facultyRepository.existsByNameAndUniversityId(facultyDto.getName(), facultyDto.getUniversityId());
        if (exists){
            return "Faculty already exists!";
        }

        Optional<University> optionalUniversity = universityRepository.findById(facultyDto.getUniversityId());
        if (optionalUniversity.isEmpty()) {
            return "University not found!";
        }

        facultyRepository.save(new Faculty(facultyDto.getName(), optionalUniversity.get()));
        return "Faculty added successfully";
    }
}
