package model.entity;

import java.io.Serializable;

public class UserBean implements Serializable{
	private String user_id;
	private String password;
	private int login_user_flg;
	
	public UserBean() {
		
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getLogin_user_flg() {
		return login_user_flg;
	}

	public void setLogin_user_flg(int login_user_flg) {
		this.login_user_flg = login_user_flg;
	}
	
}
