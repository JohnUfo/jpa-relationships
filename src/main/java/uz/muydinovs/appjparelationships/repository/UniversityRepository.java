package uz.muydinovs.appjparelationships.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.muydinovs.appjparelationships.entity.University;

public interface UniversityRepository extends JpaRepository<University,Integer> {

}
