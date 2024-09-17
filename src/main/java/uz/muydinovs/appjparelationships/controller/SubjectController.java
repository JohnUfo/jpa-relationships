package uz.muydinovs.appjparelationships.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import uz.muydinovs.appjparelationships.entity.Subject;
import uz.muydinovs.appjparelationships.repository.SubjectRepository;

import java.util.List;

@RestController()
public class SubjectController {

    @Autowired
    SubjectRepository subjectRepository;

    @RequestMapping(value = "/subject", method = RequestMethod.GET)
    public List<Subject> getSubjects() {
        return subjectRepository.findAll();
    }
}
