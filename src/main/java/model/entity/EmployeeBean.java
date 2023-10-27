package model.entity;

public class EmployeeBean {
	private int employeeCode;
	private String lastName;
	private String firstName;
	private String lastkanaName;
	private String firstkanaName;
	private String birthDay;
	private int gender;
	private String sectionCode;
	private String hireCode;
	private String updateDatetime;

	public int getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(int employeeCode) {
		this.employeeCode = employeeCode;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastKanaName() {
		return lastkanaName;
	}

	public void setLastKanaName(String lastkanaName) {
		this.lastkanaName = lastkanaName;
	}
	
	public String getFirstKanaName() {
		return firstkanaName;
	}

	public void setFirstKanaName(String firstkanaName) {
		this.firstkanaName = firstkanaName;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}
	
	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public String getSectionCode() {
		return sectionCode;
	}

	public void setSectionCode(String sectionCode) {
		this.sectionCode = sectionCode;
	}

	public String getHireCode() {
		return hireCode;
	}

	public void setHireCode(String hireCode) {
		this.hireCode = hireCode;
	}
	
	public String getUpdateDatetime() {
		return updateDatetime;
	}

	public void setUpdateDatetime(String updateDatetime) {
		this.updateDatetime = updateDatetime;
	}

}
