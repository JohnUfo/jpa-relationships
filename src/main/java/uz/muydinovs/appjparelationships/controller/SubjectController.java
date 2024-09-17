package uz.muydinovs.appjparelationships.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uz.muydinovs.appjparelationships.entity.Subject;
import uz.muydinovs.appjparelationships.repository.SubjectRepository;

import java.util.List;

@RestController()
@RequestMapping(value = "/subject")
public class SubjectController {

    @Autowired
    SubjectRepository subjectRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Subject> getAll() {
        return subjectRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET)
    public Subject getById(@RequestParam("id") Integer id) {
        return subjectRepository.findById(id).orElse(null);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Subject create(@RequestBody Subject subject) {
        return subjectRepository.save(subject);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Subject update(@RequestBody Subject subject) {
        return subjectRepository.save(subject);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteById(@RequestParam("id") Integer id) {
        subjectRepository.deleteById(id);
    }
}
