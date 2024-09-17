package uz.muydinovs.appjparelationships.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uz.muydinovs.appjparelationships.entity.Address;
import uz.muydinovs.appjparelationships.repository.AddressRepository;
import uz.muydinovs.appjparelationships.service.AddressService;

import java.util.List;

@RestController()
public class AddressController {

    @Autowired
    AddressRepository addressRepository;

    @Autowired
    AddressService addressService;

    @RequestMapping(value = "/address", method = RequestMethod.GET)
    public List<Address> getAddresses() {
        return addressRepository.findAll();
    }

    @RequestMapping(value = "/address/{id}", method = RequestMethod.GET)
    public Address getAddressById(@PathVariable Integer id) {
        return addressRepository.getAddressesById(id);
    }

    @RequestMapping(value = "/address", method = RequestMethod.POST)
    public String addAddress(@RequestBody Address address) {
        addressRepository.save(address);
        return "Address added successfully";
    }

    @RequestMapping(value = "/address/{id}", method = RequestMethod.PUT)
    public String addAddress(@RequestBody Address address, @PathVariable("id") Integer id) {
        return addressService.updateAddress(address, id);
    }
}
