package uz.muydinovs.appjparelationships.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.muydinovs.appjparelationships.entity.Faculty;

public interface FacultyRepository extends JpaRepository<Faculty,Integer> {

    Faculty getFacultyById(Integer id);

    boolean existsByNameAndUniversityId(String name, int universityId);
}
