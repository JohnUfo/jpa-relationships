package uz.muydinovs.appjparelationships.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uz.muydinovs.appjparelationships.entity.Faculty;
import uz.muydinovs.appjparelationships.entity.Group;
import uz.muydinovs.appjparelationships.payload.GroupDto;
import uz.muydinovs.appjparelationships.repository.FacultyRepository;
import uz.muydinovs.appjparelationships.repository.GroupRepository;
import uz.muydinovs.appjparelationships.repository.UniversityRepository;

import java.util.List;
import java.util.Optional;

@RestController()
@RequestMapping("/group")
public class GroupController {

    @Autowired
    GroupRepository groupRepository;

    @Autowired
    FacultyRepository facultyRepository;

    @GetMapping
    public List<Group> getAllGroups() {
        return groupRepository.findAll();
    }

    @GetMapping("/{id}")
    public Group getById(@PathVariable("id") Integer id) {
        return groupRepository.findById(id).orElse(null);
    }

    @GetMapping("/byUniversityId/{universityId}")
    public List<Group> getByUniversityId(@PathVariable("universityId") Integer universityId) {
        return groupRepository.findAllByFaculty_University_Id(universityId);
    }

    @PostMapping
    public String addGroup(@RequestBody GroupDto groupDto) {
        Group group = new Group();
        group.setName(groupDto.getName());
        Optional<Faculty> optionalFaculty = facultyRepository.findById(groupDto.getFacultyId());
        if (optionalFaculty.isEmpty()) {
            return "Such faculty does not exist";
        }
        group.setFaculty(optionalFaculty.get());
        groupRepository.save(group);
        return "Faculty added successfully";
    }


}
