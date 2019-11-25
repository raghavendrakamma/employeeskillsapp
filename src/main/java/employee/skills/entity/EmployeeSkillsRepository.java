package employee.skills.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
 
@Repository("employeeSkillsRepository")
public interface EmployeeSkillsRepository 
        extends JpaRepository<EmployeeSkillsEntity, Long> {
 
}