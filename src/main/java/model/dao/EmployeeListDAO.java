package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.entity.EmployeeListBean;

public class EmployeeListDAO {

	public List<EmployeeListBean> selectEmployee() throws SQLException, ClassNotFoundException {

		/* インスタンス化して、オブジェクトとして従業員リストを生成します。*/
		List<EmployeeListBean> employeeList = new ArrayList<EmployeeListBean>();

		/* 従業員マスタ、m_employeeのデータを全てSELECTします。*/
		String sql = " SELECT * FROM m_employee";

		/* データベース接続を行い、同時にpreparedstatementの取得を行います。*/
		try (Connection con = ConnectionManager.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)) {

			/* SQLステートメントを実行します。*/
			ResultSet res = pstmt.executeQuery();

			/* 従業員マスタ、m_employeeに登録されている情報が全て取り出されるまで、結果の操作を行います。*/
			while(res.next()) {
				
				/* インスタンス化して、EmployeeListBeanを生成します。*/
				EmployeeListBean bean = new EmployeeListBean ();
				
				String employeeCode = res.getString("employee_code");
				String lastName = res.getString("last_name");
				String firstName = res.getString("first_name");
				String lastKanaName = res.getString("last_kana_name");
				String firstKanaName = res.getString("first_kana_name");
				String gender = res.getString("gender");
				String birthDay = res.getString("birth_day");
				String sectionCode = res.getString ("section_code");
				String hireDate = res.getString("hire_date");
				String updateDatetime = res.getString("update_datetime");
				
				bean.setEmployeeCode(employeeCode);
				bean.setLastName(lastName);
				bean.setFirstName(firstName);
				bean.setLastKanaName(lastKanaName);
				bean.setFirstKanaName(firstKanaName);
				bean.setGender(gender);
				bean.setBirthDay(birthDay);
				bean.setSectionCode(sectionCode);
				bean.setHireDate(hireDate);
				bean.setUpdateDatetime(updateDatetime);
				
				employeeList.add(bean);
				
				
			}
			

			
		}
		/* employeeListを返します。*/
		return employeeList;
		
	}

}
