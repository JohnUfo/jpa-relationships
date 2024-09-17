package uz.muydinovs.appjparelationships.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.muydinovs.appjparelationships.entity.Address;
import uz.muydinovs.appjparelationships.entity.University;
import uz.muydinovs.appjparelationships.payload.UniversityDto;
import uz.muydinovs.appjparelationships.repository.AddressRepository;
import uz.muydinovs.appjparelationships.repository.UniversityRepository;

@Service
public class UniversityService {

    @Autowired
    UniversityRepository universityRepository;
    @Autowired
    AddressRepository addressRepository;

    public UniversityService(UniversityRepository universityRepository, AddressRepository addressRepository) {
        this.universityRepository = universityRepository;
        this.addressRepository = addressRepository;
    }


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
}
