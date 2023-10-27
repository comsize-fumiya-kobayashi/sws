package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.entity.EmployeeBean;

public class EmployeeCategoryDAO {
	
	public int insertEmployee(EmployeeBean employeeInfo)
			throws SQLException, ClassNotFoundException {

		int processingNumber = 0; //処理件数
		String sql = "INSERT INTO m_employee(employeeCode,lastName,firstName,lastkanaName,firstkanaName,birthDay,sectionCode,hireCode)VALUES(?,?,?,?,?,?,?,?,?,?)";
		// データベースへの接続の取得、Statementの取得、SQLステートメントの実行
		try (Connection con = ConnectionManager.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setInt(1, employeeInfo.getEmployeeCode());
			pstmt.setString(2, employeeInfo.getLastName());
			pstmt.setString(3, employeeInfo.getFirstName());
			pstmt.setString(4, employeeInfo.getLastKanaName());
			pstmt.setString(5, employeeInfo.getFirstKanaName());
			pstmt.setInt(6, employeeInfo.getGender());
			pstmt.setString(7, employeeInfo.getBirthDay());
			pstmt.setString(8, employeeInfo.getSectionCode());
			pstmt.setString(9, employeeInfo.getHireCode());
			pstmt.setString(10, employeeInfo.getUpdateDatetime());
			processingNumber = pstmt.executeUpdate();
		}
		return processingNumber;
	}

}
