package employee.skills.model;

public class EmployeeSkillsInformation {
	private Long studentId;
    private String studentName;
    private String email;
    private String contactNumber;
    private String coursesFamiliarWith;
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getCoursesFamiliarWith() {
		return coursesFamiliarWith;
	}
	public void setCoursesFamiliarWith(String coursesFamiliarWith) {
		this.coursesFamiliarWith = coursesFamiliarWith;
	}
    
     
}
