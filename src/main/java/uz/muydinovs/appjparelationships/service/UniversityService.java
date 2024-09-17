package uz.muydinovs.appjparelationships.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.muydinovs.appjparelationships.entity.Address;
import uz.muydinovs.appjparelationships.entity.University;
import uz.muydinovs.appjparelationships.payload.UniversityDto;
import uz.muydinovs.appjparelationships.repository.AddressRepository;
import uz.muydinovs.appjparelationships.repository.UniversityRepository;

import java.util.Optional;

@Service
public class UniversityService {

    @Autowired
    UniversityRepository universityRepository;

    @Autowired
    AddressRepository addressRepository;


    public void addUniversity(UniversityDto universityDto) {
        University university = new University();
        Address address = new Address();
        address.setCity(universityDto.getCity());
        address.setDistrict(universityDto.getDistrict());
        address.setStreet(universityDto.getStreet());
        university.setName(universityDto.getName());
        university.setAddress(address);
        addressRepository.save(address);
        universityRepository.save(university);
    }

    public String updateUniversity(UniversityDto universityDto, Integer id) {
        Optional<University> optionalUniversity = universityRepository.findById(id);
        if (optionalUniversity.isPresent()) {
            University university = optionalUniversity.get();
            university.setName(universityDto.getName());
            university.getAddress().setCity(universityDto.getCity());
            university.getAddress().setDistrict(universityDto.getDistrict());
            university.getAddress().setStreet(universityDto.getStreet());
            universityRepository.save(university);
            return "Successfully updated university";
        }
        return "University not found";
    }
}
