package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.bean.BankDetails;
import com.lti.bean.LoanDetails;

@Repository
@Scope("singleton")
@Transactional(propagation = Propagation.REQUIRED)

public class LoanDaoImpl implements LoanDao{

	@PersistenceContext
	EntityManager manager;

	@Override
	public LoanDetails getLoanDetails(String email) {
		Query qry = manager.createQuery("FROM LoanDetails WHERE email= :email");
		qry.setParameter("email", email);
		LoanDetails loan = (LoanDetails) qry.getSingleResult();
		return loan;
	}

	@Override
	public void insertLoanDetails(LoanDetails loan) {
		manager.persist(loan);

	}

	@Override
	public List<LoanDetails> getLoanList() {
		Query qry = manager.createQuery("FROM LoanDetails where status=0 and rejectStatus=0 ");
		return qry.getResultList();
	}

	@Override
	public void acceptRequest(String email) {
		Query qry=manager.createQuery("UPDATE LoanDetails set status=1 where email=:email");
		qry.setParameter("email",email);
		int updateCount=0;
		updateCount=qry.executeUpdate();
	}

	@Override
	public void rejectRequest(String email) {
		Query qry=manager.createQuery("UPDATE LoanDetails set rejectStatus=1 where email=:email");
		qry.setParameter("email",email);
		int updateCount=0;
		updateCount=qry.executeUpdate();
	}

	@Override
	public void updateLoanDetails(LoanDetails loan) {
		Query qry=manager.createQuery("UPDATE LoanDetails loan set loan.loanAmount=:amount,loan.roi=:roi,loan.loanTenure=:tenure,loan.emi=:emi where email=:email");
		qry.setParameter("email",loan.getEmail());
		qry.setParameter("amount",loan.getLoanAmount());
		qry.setParameter("roi",loan.getRoi());
		qry.setParameter("tenure", loan.getLoanTenure());
		qry.setParameter("emi",loan.getEmi());
		int updateCount=0;
		updateCount=qry.executeUpdate();
	}

}
