package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.bean.VehicleDetails;

@Repository
@Scope("singleton")
@Transactional(propagation=Propagation.REQUIRED)
public class VehicleDaoImpl implements VehicleDao{

	@PersistenceContext
	EntityManager manager;
	

	@Override
	public VehicleDetails getVehicle(String email) {
		Query qry = manager.createQuery("FROM VehicleDetails WHERE email= :email");
		qry.setParameter("email",email);
		VehicleDetails vehicle=(VehicleDetails) qry.getSingleResult();
		return vehicle;
	}


	@Override
	public boolean insertDetails(VehicleDetails vehicle) {
		manager.persist(vehicle);		
		return true;
	}


}
