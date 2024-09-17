package uz.muydinovs.appjparelationships.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.muydinovs.appjparelationships.entity.Address;
import uz.muydinovs.appjparelationships.entity.Faculty;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address, Integer> {

    Address getAddressesById(Integer id);
}
