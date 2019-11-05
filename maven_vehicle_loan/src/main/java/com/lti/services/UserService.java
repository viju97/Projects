package com.lti.services;

import java.util.List;

import com.lti.bean.BankDetails;
import com.lti.bean.LoanDetails;
import com.lti.bean.User1;
import com.lti.bean.UserDetails;
import com.lti.bean.VehicleDetails;

public interface UserService {
	public List<UserDetails> getuserlist();
	public boolean checkLogin(String email,String password);
	public UserDetails getUser(String email);
	public void updateUser(UserDetails user);
	public boolean insertRegDetails(UserDetails user);
	public boolean checkAdmin(String email,String password);
	public VehicleDetails getVehicle(String email);
	public boolean insertDetails(VehicleDetails vehicle);
	public BankDetails getBankDetails(String email);
	public void insertBankDetails(BankDetails bank);
	public void newBankDetails(String email,UserDetails user);
	public LoanDetails getLoanDetails(String email);
	public void insertLoanDetails(LoanDetails loan);
	public void updateLoanDetails(LoanDetails loan);

	public List<LoanDetails> getLoanList();
	public void acceptRequest(String email);
	public void rejectRequest(String email);



}
