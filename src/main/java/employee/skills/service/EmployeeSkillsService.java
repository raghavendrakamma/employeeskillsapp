package employee.skills.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import employee.skills.entity.EmployeeSkillsEntity;
import employee.skills.entity.EmployeeSkillsRepository;
import employee.skills.model.EmployeeSkillsInformation;

@Service
public class EmployeeSkillsService {
	@Autowired
	@Qualifier("employeeSkillsRepository")
	EmployeeSkillsRepository repository;

	public List<EmployeeSkillsInformation> getAllEmployeeSkills() {
		List<EmployeeSkillsEntity> studentsListFromDb = repository.findAll();
System.out.println("=== EmployeeSkills list from db done");
System.out.println("=== EmployeeSkills list from db done SIZE"+studentsListFromDb.size());
		if (studentsListFromDb.size() > 0) {
			List<EmployeeSkillsInformation> employeeSkillsListToClient = new ArrayList<EmployeeSkillsInformation>();
			for(EmployeeSkillsEntity employeeSkillsEntity : studentsListFromDb)
			{
				EmployeeSkillsInformation employeeSkillsInfo = new EmployeeSkillsInformation();
				employeeSkillsInfo.setEmail(employeeSkillsEntity.getEmail());
				employeeSkillsInfo.setContactNumber(employeeSkillsEntity.getContactNumber());
				employeeSkillsInfo.setCoursesFamiliarWith(employeeSkillsEntity.getCoursesFamiliarWith());
				employeeSkillsInfo.setStudentName(employeeSkillsEntity.getName());
				employeeSkillsInfo.setStudentId(employeeSkillsEntity.getId());
				employeeSkillsListToClient.add(employeeSkillsInfo);
			}
			return employeeSkillsListToClient;
		} else {
			return new ArrayList<EmployeeSkillsInformation>();
		}
	}

	public EmployeeSkillsInformation getEmployeeSkillsById(Long id) throws Exception {
		System.out.println("==EmployeeSkills service, get student by id");
		EmployeeSkillsEntity employeeSkillsEntity = repository.findOne(id);
		
		if (employeeSkillsEntity != null) {
			EmployeeSkillsInformation studentInfo = new EmployeeSkillsInformation();
			studentInfo.setEmail(employeeSkillsEntity.getEmail());
			studentInfo.setContactNumber(employeeSkillsEntity.getContactNumber());
			studentInfo.setCoursesFamiliarWith(employeeSkillsEntity.getCoursesFamiliarWith());
			studentInfo.setStudentName(employeeSkillsEntity.getName());
			studentInfo.setStudentId(employeeSkillsEntity.getId());
			return studentInfo;
		} else {
			throw new Exception("No EmployeeSkills record exist for given id");
		}
	}

	public EmployeeSkillsInformation createOrUpdateEmployeeSkills(EmployeeSkillsInformation employeeSkillsInfo) throws Exception {
		if (employeeSkillsInfo != null) {
			EmployeeSkillsEntity employeeSkillsRecord = new EmployeeSkillsEntity();
			employeeSkillsRecord.setEmail(employeeSkillsInfo.getEmail());
			employeeSkillsRecord.setName(employeeSkillsInfo.getStudentName());
			employeeSkillsRecord.setContactNumber(employeeSkillsInfo.getContactNumber());
			employeeSkillsRecord.setCoursesFamiliarWith(employeeSkillsInfo.getCoursesFamiliarWith());
			employeeSkillsRecord.setId((long)Math.random());
			System.out.println("===Repository Object=="+repository);
			employeeSkillsRecord = repository.save(employeeSkillsRecord);
			employeeSkillsInfo.setStudentId(employeeSkillsRecord.getId());
			return employeeSkillsInfo;
		}
		return null;
	}
	
	public EmployeeSkillsInformation updateEmployeeSkills(EmployeeSkillsInformation employeeSkillsInfo) throws Exception {
		if (employeeSkillsInfo != null && employeeSkillsInfo.getStudentId()!=null) {
			EmployeeSkillsEntity employeeSkillsRecord = repository.findOne(employeeSkillsInfo.getStudentId());
			
			 
			employeeSkillsRecord.setEmail(employeeSkillsInfo.getEmail());
			employeeSkillsRecord.setName(employeeSkillsInfo.getStudentName());
			employeeSkillsRecord.setContactNumber(employeeSkillsInfo.getContactNumber());
			employeeSkillsRecord.setCoursesFamiliarWith(employeeSkillsInfo.getCoursesFamiliarWith());
			employeeSkillsRecord.setId(employeeSkillsRecord.getId());
			System.out.println("===Repository Object=="+repository);
			employeeSkillsRecord = repository.save(employeeSkillsRecord);
			
			return employeeSkillsInfo;
		}
		return null;
	}

	public EmployeeSkillsInformation deleteEmployeeSkillsById(Long id) throws Exception {
		EmployeeSkillsEntity employeeSkillsRecord = repository.findOne(id);
		EmployeeSkillsInformation studentInfo = new EmployeeSkillsInformation();
		

		if (employeeSkillsRecord != null) {
		
			
			studentInfo.setEmail(employeeSkillsRecord.getEmail());
			studentInfo.setContactNumber(employeeSkillsRecord.getContactNumber());
			studentInfo.setCoursesFamiliarWith(employeeSkillsRecord.getCoursesFamiliarWith());
			studentInfo.setStudentName(employeeSkillsRecord.getName());
			studentInfo.setStudentId(employeeSkillsRecord.getId());
			repository.delete(id);
		} else {
			throw new Exception("No employee record exist for given id");
		}
		return studentInfo;
	}
}
