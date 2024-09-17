package uz.muydinovs.appjparelationships.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import uz.muydinovs.appjparelationships.entity.Group;
import uz.muydinovs.appjparelationships.entity.University;
import uz.muydinovs.appjparelationships.repository.GroupRepository;
import uz.muydinovs.appjparelationships.repository.UniversityRepository;

import java.util.List;

@RestController()
public class GroupController {

    @Autowired
    GroupRepository groupRepository;

    @RequestMapping(value = "/group", method = RequestMethod.GET)
    public List<Group> getAllGroups() {
        return groupRepository.findAll();
    }
}
