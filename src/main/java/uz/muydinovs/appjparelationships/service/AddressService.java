package uz.muydinovs.appjparelationships.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.muydinovs.appjparelationships.entity.Address;
import uz.muydinovs.appjparelationships.repository.AddressRepository;

@Service
public class AddressService {

    @Autowired
    AddressRepository addressRepository;

    public String updateAddress(Address address, Integer id) {
        Address optionalAddress = addressRepository.getAddressesById(id);
        if(optionalAddress != null) {
            optionalAddress.setCity(address.getCity());
            optionalAddress.setDistrict(address.getDistrict());
            optionalAddress.setStreet(address.getStreet());
            addressRepository.save(optionalAddress);
            return "Address updated successfully!";
        }
        return "Address not found!";
    }
}
