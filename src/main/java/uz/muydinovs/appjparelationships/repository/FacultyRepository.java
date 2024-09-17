package uz.muydinovs.appjparelationships.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.muydinovs.appjparelationships.entity.Faculty;
import uz.muydinovs.appjparelationships.entity.Group;

public interface FacultyRepository extends JpaRepository<Faculty,Integer> {

    Faculty getFacultyById(Integer id);
}
