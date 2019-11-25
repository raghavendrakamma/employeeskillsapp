package employee.skills.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name="EmployeeSkills")
public class EmployeeSkillsEntity {
	 
	
	private static final long SerialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private long id;
    
    @Column(name="name")
    private String name;
     
    @Column(name="email")
    private String email;
     
    
    @Column(name="coursesFamiliarWith")
    private String coursesFamiliarWith;
    
    @Column(name="contactNumber")
    private String contactNumber;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCoursesFamiliarWith() {
		return coursesFamiliarWith;
	}

	public void setCoursesFamiliarWith(String coursesFamiliarWith) {
		this.coursesFamiliarWith = coursesFamiliarWith;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
     
    
}
