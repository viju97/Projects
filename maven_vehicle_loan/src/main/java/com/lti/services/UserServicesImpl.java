package com.lti.services;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.bean.BankDetails;
import com.lti.bean.LoanDetails;
import com.lti.bean.User1;
import com.lti.bean.UserDetails;
import com.lti.bean.VehicleDetails;
import com.lti.dao.BankDao;
import com.lti.dao.LoanDao;
import com.lti.dao.UserDao;
import com.lti.dao.VehicleDao;

import sun.print.resources.serviceui;

@Service("UserService")
@Scope("singleton")
@Transactional(propagation=Propagation.REQUIRED)

public class UserServicesImpl implements UserService {

	@Autowired
	UserDao dao;
	
	@Autowired
	VehicleDao vehicledao;

	@Autowired
	BankDao bankdao;

	@Autowired
	LoanDao loandao;
	@Override
	public List<UserDetails> getuserlist() {
		return dao.getuserlist();
	}

	@Override
	public boolean checkLogin(String email, String password) {
		return dao.checkLogin(email,password);
	}

	@Override
	public boolean insertRegDetails(UserDetails user) {
		return dao.insertRegDetails(user);
	}

	@Override
	public boolean checkAdmin(String email, String password) {
		return dao.checkAdmin(email, password);
	}

	@Override
	public UserDetails getUser(String email) {
		
		return dao.getUser(email);
	}

	@Override
	public void updateUser(UserDetails user) {
		dao.updateUser(user);
	}

	@Override
	public VehicleDetails getVehicle(String email) {
		return vehicledao.getVehicle(email);
	}

	@Override
	public boolean insertDetails(VehicleDetails vehicle) {
		return vehicledao.insertDetails(vehicle);
	}

	@Override
	public BankDetails getBankDetails(String email) {
		return bankdao.getBankDetails(email);
	}

	@Override
	public void insertBankDetails(BankDetails bank) {
		bankdao.insertBankDetails(bank);
	}

	@Override
	public void newBankDetails(String email, UserDetails user) {
		bankdao.newBankDetails(email, user);
	}

	@Override
	public LoanDetails getLoanDetails(String email) {
		return loandao.getLoanDetails(email);
	}

	@Override
	public void insertLoanDetails(LoanDetails loan) {
		loandao.insertLoanDetails(loan);
	}

	@Override
	public List<LoanDetails> getLoanList() {
		return loandao.getLoanList();
	}

	@Override
	public void acceptRequest(String email) {
		loandao.acceptRequest(email);
	}

	@Override
	public void rejectRequest(String email) {
		loandao.rejectRequest(email);
	}

	@Override
	public void updateLoanDetails(LoanDetails loan) {
		loandao.updateLoanDetails(loan);
	}

	
}
