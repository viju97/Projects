package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.bean.User1;
import com.lti.bean.UserDetails;

@Repository
@Scope("singleton")
@Transactional(propagation=Propagation.REQUIRED)
public class UserDaoImpl implements UserDao {

	@PersistenceContext
	EntityManager manager;
	
	@Override
	public List<UserDetails> getuserlist() {
		Query qry = manager.createQuery("FROM UserDetails");
		return qry.getResultList();
	}
	@Override
	public boolean checkLogin(String email, String password) {
		List<UserDetails> list=getuserlist();
		for(UserDetails u:list) {
			if(u.getEmail().equals(email)) {
				if(u.getPassword().equals(password)) {
					return true;
				}
			}
		}
		return false;
	}
	@Override
	public boolean insertRegDetails(UserDetails user) {
		manager.persist(user);		
		return true;

	}
	@Override
	public boolean checkAdmin(String email, String password) {
		if(email.equals("rahul@gmail.com")) {
			if(password.equals("Rahul123!")) {
				return true;
			}
		}
		return false;
	}
	@Override
	public UserDetails getUser(String email) {
		Query qry = manager.createQuery("FROM UserDetails WHERE email= :email");
		qry.setParameter("email",email);
		UserDetails user=(UserDetails) qry.getSingleResult();
		return user;
	}
	@Override
	public void updateUser(UserDetails user) {
		Query qry=manager.createQuery("UPDATE UserDetails u set u.Address=:address , u.state=:state,u.typeOfEmployment=:typeOfEmployment ");
		qry.setParameter("address", user.getAddress());
		qry.setParameter("state",user.getState());
		qry.setParameter("typeOfEmployment",user.getTypeOfEmployment());
		int updateCount=0;
		updateCount=qry.executeUpdate();
		if(updateCount>0)
			System.out.println("success update:");
		else
			System.out.println("update failed");
		
	}

}
