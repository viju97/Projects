package com.lti.dao;

import java.util.List;

import com.lti.bean.LoanDetails;

public interface LoanDao {
	public LoanDetails getLoanDetails(String email);
	public void insertLoanDetails(LoanDetails loan);
	public List<LoanDetails> getLoanList();
	public void acceptRequest(String email);
	public void rejectRequest(String email);
	public void updateLoanDetails(LoanDetails loan);
}
