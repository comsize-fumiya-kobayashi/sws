package model.entity;

public class EmployeeListBean {
	
	/*フィールド内に、m_employeeテーブルのプロパティを10個作成します。*/
	/* プロパティは、データベースのテーブルに忠実に書きます。*/
	
	/* m_employeeから従業員コード*/
	private String employeeCode;
	
	/* m_employeeから氏*/
	private String lastName;
	
	/* m_employeeから名*/
	private String firstName;
	
	/* m_employeeから氏かな*/
	
	private String lastKanaName;
	
	/* m_employeeから名かな*/
	private String firstKanaName;
	
	/* m_employeeから性別*/
	private String gender;
	
	/* m_employeeから生年月日*/
	private String  birthDay;
	
	/* m_employeeから部署コード*/
	private String sectionCode;
	
	
	/* m_employeeから入社日*/
	private String hireDate;
	
	/* m_employeeから更新日時*/
	private String updateDatetime;

	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
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
		return lastKanaName;
	}

	public void setLastKanaName(String lastKanaName) {
		this.lastKanaName = lastKanaName;
	}

	public String getFirstKanaName() {
		return firstKanaName;
	}

	public void setFirstKanaName(String firstKanaName) {
		this.firstKanaName = firstKanaName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
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

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public String getUpdateDatetime() {
		return updateDatetime;
	}

	public void setUpdateDatetime(String updateDatetime) {
		this.updateDatetime = updateDatetime;
	}

	
	
	
	
	
}
