package com.lti.dao;

import com.lti.bean.BankDetails;
import com.lti.bean.UserDetails;

public interface BankDao {
	public BankDetails getBankDetails(String email);
	public void insertBankDetails(BankDetails bank);
	public void newBankDetails(String email,UserDetails user);

}
