package uz.muydinovs.appjparelationships.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.muydinovs.appjparelationships.entity.Group;

import java.util.List;

public interface GroupRepository extends JpaRepository<Group,Integer> {

    List<Group> findAllByFaculty_University_Id(Integer universityId);
}
