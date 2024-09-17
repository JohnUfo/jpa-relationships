package uz.muydinovs.appjparelationships.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.muydinovs.appjparelationships.entity.Subject;
import uz.muydinovs.appjparelationships.entity.University;

public interface SubjectRepository extends JpaRepository<Subject,Integer> {

}
