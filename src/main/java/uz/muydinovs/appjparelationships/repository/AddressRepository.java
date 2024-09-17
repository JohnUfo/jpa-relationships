package uz.muydinovs.appjparelationships.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.muydinovs.appjparelationships.entity.Address;
import uz.muydinovs.appjparelationships.entity.Faculty;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
