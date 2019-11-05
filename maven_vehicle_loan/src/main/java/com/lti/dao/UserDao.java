package com.lti.dao;

import java.util.List;

import com.lti.bean.User1;
import com.lti.bean.UserDetails;

public interface UserDao {
	public boolean checkLogin(String email, String password);

	public boolean insertRegDetails(UserDetails user);
	public UserDetails getUser(String email);
	public void updateUser(UserDetails user);
	public List<UserDetails> getuserlist();
	public boolean checkAdmin(String email,String password);
}
