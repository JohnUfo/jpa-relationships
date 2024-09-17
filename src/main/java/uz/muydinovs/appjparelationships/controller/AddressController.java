package uz.muydinovs.appjparelationships.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import uz.muydinovs.appjparelationships.entity.Address;
import uz.muydinovs.appjparelationships.entity.University;
import uz.muydinovs.appjparelationships.repository.AddressRepository;
import uz.muydinovs.appjparelationships.repository.UniversityRepository;

import java.util.List;

@RestController()
public class AddressController {

    @Autowired
    AddressRepository addressRepository;

    @RequestMapping(value = "/address", method = RequestMethod.GET)
    public List<Address> getAddresses() {
        return addressRepository.findAll();
    }
}
