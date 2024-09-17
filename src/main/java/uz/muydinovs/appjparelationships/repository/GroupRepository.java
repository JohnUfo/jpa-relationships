package uz.muydinovs.appjparelationships.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.muydinovs.appjparelationships.entity.Group;
import uz.muydinovs.appjparelationships.entity.Student;

public interface GroupRepository extends JpaRepository<Group,Integer> {

}
