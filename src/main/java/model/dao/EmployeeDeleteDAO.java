package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDeleteDAO {

	public int deleteEmployee(int employeeCode) throws SQLException, ClassNotFoundException {
		String sql = "DELETE FROM m_employee WHERE employee_code = ?";
		
		/* 処理件数を宣言します。*/
		int processingNumber = 0; 
		
		/* データベース接続です。*/
		try (Connection con = ConnectionManager.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			/*  プレースホルダへの値を設定します。 */
			pstmt.setInt(1, employeeCode);
			processingNumber = pstmt.executeUpdate();
		}
		return processingNumber;

	}
}
