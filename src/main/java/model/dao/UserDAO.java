package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
	public boolean loginCheck(String user_id, String password) throws ClassNotFoundException, SQLException {
		String sql = "SELECT * FROM m_user WHERE user_id = ? AND password = ?";
		
		try(Connection con =ConnectionManager.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)){
			
			pstmt.setString(1, user_id);
			pstmt.setString(2, password);
			
			ResultSet res = pstmt.executeQuery();
			
			if(res.next()) {
				return true;
			}
		}
		return false;
	}
}
