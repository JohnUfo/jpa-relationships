package uz.muydinovs.appjparelationships.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uz.muydinovs.appjparelationships.entity.Address;
import uz.muydinovs.appjparelationships.repository.AddressRepository;
import uz.muydinovs.appjparelationships.service.AddressService;

import java.util.List;

@RestController()
@RequestMapping("/address")
public class AddressController {

    @Autowired
    AddressRepository addressRepository;

    @Autowired
    AddressService addressService;

    @GetMapping
    public List<Address> getAddresses() {
        return addressRepository.findAll();
    }

    @GetMapping("/{id}")
    public Address getAddressById(@PathVariable Integer id) {
        return addressRepository.getAddressesById(id);
    }

    @PostMapping
    public String addAddress(@RequestBody Address address) {
        addressRepository.save(address);
        return "Address added successfully";
    }

    @PutMapping("/{id}")
    public String updateAddress(@RequestBody Address address, @PathVariable("id") Integer id) {
        return addressService.updateAddress(address, id);
    }
}
