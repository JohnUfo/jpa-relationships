package uz.muydinovs.appjparelationships.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.muydinovs.appjparelationships.entity.Student;
import uz.muydinovs.appjparelationships.entity.Subject;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
