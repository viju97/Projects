package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.bean.BankDetails;
import com.lti.bean.UserDetails;

@Repository
@Scope("singleton")
@Transactional(propagation = Propagation.REQUIRED)

public class BankDaoImpl implements BankDao {

	@PersistenceContext
	EntityManager manager;

	@Override
	public BankDetails getBankDetails(String email) {
		Query qry = manager.createQuery("FROM BankDetails WHERE email= :email");
		qry.setParameter("email", email);
		BankDetails bank = (BankDetails) qry.getSingleResult();
		return bank;
	}

	@Override
	public void insertBankDetails(BankDetails bank) {
		manager.persist(bank);

	}

	@Override
	public void newBankDetails(String email,UserDetails user) {
		int maxId = (int) manager.createQuery("Select max(accountNo) from BankDetails").getSingleResult();
		System.out.println(maxId);
		BankDetails bank = new BankDetails();
		int id = maxId + 1;
		bank.setAccountName(user.getFirstName());
		bank.setIfscCode("11546");
		bank.setEmail(email);
		bank.setExistingAccountNo(id);
		
		manager.persist(bank);
	}
}
